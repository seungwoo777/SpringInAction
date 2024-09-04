package com.study.springinaction.model.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

// lombok은 런타임시에 자동으로 생성
@Data
@AllArgsConstructor
public class Ingredient {
    private final String id;
    private final String name;
    private Type type;
    public static enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
