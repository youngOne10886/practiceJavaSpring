package com.youngOne.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    // 기본 페이지 요청 메소드
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("data", "test");
        return "index";
    }

    @GetMapping("/mvc")
    public String practiceMVC(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        return "practiceMVC";
    }
}
