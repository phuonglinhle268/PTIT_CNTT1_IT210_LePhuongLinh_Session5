package org.example.java_web_session5.controller;

import org.example.java_web_session5.model.Dish;
import org.example.java_web_session5.service.DishService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class DishController {

    private final DishService dishService = new DishService();

    @GetMapping("/bai2/dishes")
    public String showDishes(Model model) {
        List<Dish> dishes = dishService.getAllDishes();

        model.addAttribute("dishes", dishes);

        return "dish-list";
    }
}