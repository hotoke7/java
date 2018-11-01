package com.practice.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * HelloWorldコントローラ。
 */
@Controller
@RequestMapping("/helloWorld")
public class HelloWorldController {

    @RequestMapping(value="")
    public String hello() {
        return "helloWorldForm";
    }
}
