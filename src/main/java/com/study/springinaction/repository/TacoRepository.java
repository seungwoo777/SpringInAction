package com.study.springinaction.repository;

import com.study.springinaction.model.Entity.Taco;

public interface TacoRepository {
    Taco save(Taco design);
}
