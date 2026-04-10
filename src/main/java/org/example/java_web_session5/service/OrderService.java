package org.example.java_web_session5.service;


import org.example.java_web_session5.model.Dish;
import org.example.java_web_session5.model.OrderItem;
import org.example.java_web_session5.repository.OrderRepository;

import java.util.List;

public class OrderService {

    private final OrderRepository repo = new OrderRepository();

    public List<Dish> getMenu() {
        return repo.findAll();
    }

    public double calculateTotal(List<OrderItem> items) {
        return items.stream()
                .mapToDouble(i -> i.getDish().getPrice() * i.getQuantity())
                .sum();
    }
}