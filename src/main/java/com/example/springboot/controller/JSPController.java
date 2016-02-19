package com.example.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Deven on 2016-02-17.
 */
@Controller
@RequestMapping("/jsp")
public class JSPController {

    @RequestMapping("/test")
    public String test(ModelAndView modelAndView) {

        return "jsp-spring-boot";
    }

}
