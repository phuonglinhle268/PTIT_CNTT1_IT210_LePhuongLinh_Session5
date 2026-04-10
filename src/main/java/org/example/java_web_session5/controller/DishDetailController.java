package org.example.java_web_session5.controller;


import org.example.java_web_session5.model.Dish;
import org.example.java_web_session5.repository.OrderRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class DishDetailController {

    private final OrderRepository repo = new OrderRepository();

    @GetMapping("/bai5/dish/{id}")
    public String detail(@PathVariable("id") Long id, Model model) {

        Dish dish = repo.findById(id);

        if (dish == null) {
            model.addAttribute("errorMessage", "Không tìm thấy món ăn!");
            return "redirect:/bai2/dishes";
        }

        model.addAttribute("dish", dish);
        return "dish-detail";
    }
}