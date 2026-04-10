package org.example.java_web_session5.controller;


import org.example.java_web_session5.model.Dish;
import org.example.java_web_session5.service.AdminDishService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AdminDishController {

    private final AdminDishService service = new AdminDishService();

    @GetMapping("/bai3/edit/{id}")
    public String editDish(@PathVariable("id") Long id, Model model) {
        Dish dish = service.findById(id);

        //ID không tồn tại
        if (dish == null) {
            model.addAttribute("errorMessage", "Không tìm thấy món ăn yêu cầu!");
            return "redirect:/bai2/dishes";
        }

        model.addAttribute("dish", dish);
        return "edit-dish";
    }
}