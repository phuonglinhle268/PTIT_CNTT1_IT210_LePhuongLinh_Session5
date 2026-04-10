package org.example.java_web_session5.service;

import org.example.java_web_session5.model.Dish;

import java.util.ArrayList;
import java.util.List;

public class AdminDishService {

    private static final List<Dish> dishes = new ArrayList<>();

    static {
        dishes.add(new Dish(1L, "Phở bò", 40000, true));
        dishes.add(new Dish(2L, "Bún chả", 35000, false));
        dishes.add(new Dish(3L, "Cơm rang", 30000, true));
    }

    public Dish findById(Long id) {
        return dishes.stream()
                .filter(d -> d.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
