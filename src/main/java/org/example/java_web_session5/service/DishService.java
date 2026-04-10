package org.example.java_web_session5.service;

import org.example.java_web_session5.model.Dish;

import java.util.ArrayList;
import java.util.List;

public class DishService {
    public List<Dish> getAllDishes() {
        List<Dish> list = new ArrayList<>();

        list.add(new Dish(1L, "Phở bò", 40000, true));
        list.add(new Dish(2L, "Bún chả", 35000, false));
        list.add(new Dish(3L, "Cơm rang", 30000, true));

        return list;
    }
}
