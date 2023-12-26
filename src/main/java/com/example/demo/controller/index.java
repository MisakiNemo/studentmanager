package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/")
public class index {


     @GetMapping("/")
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }
}
