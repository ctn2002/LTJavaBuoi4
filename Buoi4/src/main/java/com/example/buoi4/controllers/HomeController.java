package com.example.buoi4.controllers;

import com.example.buoi4.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {
    private CourseService courseService;

    @Autowired
    public HomeController(CourseService courseService){
        this.courseService = courseService;
    }

    @GetMapping("/test")
    public String index(){
        return "home";
    }

    @GetMapping("")
    public String index(Model model){
        model.addAttribute("listCourse", courseService.GetAll());
        return "home";
    }
}
