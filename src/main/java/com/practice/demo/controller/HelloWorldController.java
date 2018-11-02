package com.practice.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * HelloWorldコントローラ。
 */
@Controller
public class HelloWorldController {

    @RequestMapping("/helloWorld")
    public String hello() {
        return "helloWorldForm";
    }
}
