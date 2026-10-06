package com.example.adder;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdderController {

    @GetMapping("/")
    public String showPage() {
        return "index";
    }

    @PostMapping("/")
    public String add(
            @RequestParam(name = "a") int a,
            @RequestParam(name = "b") int b,
            Model model) {

        int result = Adder.add(a, b);
        model.addAttribute("result", result);

        return "index";
    }
}