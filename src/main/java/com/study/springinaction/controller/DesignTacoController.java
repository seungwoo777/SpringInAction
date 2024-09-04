package com.study.springinaction.controller;

import com.study.springinaction.model.Entity.Ingredient;
import com.study.springinaction.model.Entity.Order;
import com.study.springinaction.model.Entity.Taco;
import com.study.springinaction.repository.IngredientRepository;
import com.study.springinaction.repository.TacoRepository;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import com.study.springinaction.model.Entity.Ingredient.Type;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j // logger 생성
@RequestMapping("/design")
@RequiredArgsConstructor
@Controller // 스프링 application context Bean 으로 인스턴스 생성
@SessionAttributes("order")
public class DesignTacoController {

    final IngredientRepository ingredientRepository;
    final TacoRepository tacoRepository;

    @GetMapping
    public String showDesignForm(Model model) {
        List<Ingredient> ingredients = new ArrayList<>();
        ingredientRepository.findAll().forEach(ingredients::add);

        Type[] types = Ingredient.Type.values();
        for (Type type : types) {
            model.addAttribute(type.toString().toLowerCase(),
                    filterByType(ingredients, type));
        }

        model.addAttribute("taco", new Taco());

        return "design";
    }

    @ModelAttribute(name = "order")
    public Order order() {
        return new Order();
    }

    @ModelAttribute(name = "taco")
    public Taco taco() {
        return new Taco();
    }

    @PostMapping
    public String processDesign(@Valid Taco design, Errors errors, @ModelAttribute Order order) {
        if(errors.hasErrors()) return "design";

        log.info("Processing design {}", design);
        Taco saved = tacoRepository.save(design);
        order.addDesign(saved);
        return "redirect:/orders/current";
    }


    private List<Ingredient> filterByType(List<Ingredient> list, Type type) {
        return list.stream().filter(x -> x.getType().equals(type)).collect(Collectors.toList());
    }

}
