package org.example.java_web_session5.controller;


import org.example.java_web_session5.model.Dish;
import org.example.java_web_session5.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class OrderController {

    private final OrderService service = new OrderService();

    @GetMapping("/bai5/order")
    public String showOrderPage(Model model) {
        List<Dish> menu = service.getMenu();

        model.addAttribute("menu", menu);

        return "order-page";
    }
}
