package com.evozon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/home")
public class FirstController {
    @RequestMapping(value="/first",method = RequestMethod.GET)
    public ModelAndView firstFunction()
    {
        ModelAndView modelAndView=new ModelAndView("first");
        modelAndView.addObject("label","Enter your email");
        return modelAndView;
    }

    }

