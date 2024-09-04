package com.study.springinaction.repository;

import com.study.springinaction.model.Entity.Order;
import com.study.springinaction.model.Entity.Taco;

public interface OrderRepository {
    Order save(Order order);
}
