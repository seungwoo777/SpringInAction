package com.study.springinaction.config;

import com.study.springinaction.model.Entity.Ingredient;
import com.study.springinaction.repository.IngredientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class IngredientByIdConverter implements Converter<String, Ingredient> {
    final IngredientRepository ingredientRepository;

    @Override
    public Ingredient convert(String id) {
        return ingredientRepository.findById(id);
    }

    @Override
    public <U> Converter<String, U> andThen(Converter<? super Ingredient, ? extends U> after) {
        return Converter.super.andThen(after);
    }
}
