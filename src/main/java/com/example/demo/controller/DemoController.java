package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @@author  hans
 */
@Controller
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/index")
    public String  demo(){
        System.out.println("index");
        return "index";
    }
}
