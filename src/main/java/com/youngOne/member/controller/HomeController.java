package com.youngOne.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @GetMapping("/api")
    @ResponseBody
    public String practiceAPI(@RequestParam("name") String name) {
        return "practice " + name;
    }

    @GetMapping("/api2")
    @ResponseBody
    public apiClass practiceAPI2(@RequestParam("name") String name) {

    }

    static class apiClass {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
