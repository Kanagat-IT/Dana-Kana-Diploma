package com.example.qzkh_1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

public class CourseController {
    // Method
    @RequestMapping("/hello")
    public String helloUser(Model model) {

        // Sending data to view (jsp page)
        String name = "Robotics";
        model.addAttribute("Robcourse", name);

        return "demo";
    }
}
