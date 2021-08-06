package com.evozon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.awt.image.renderable.ParameterBlock;

@Controller
public class SecondController {

    @RequestMapping(value="/second",method = RequestMethod.GET)
    public ModelAndView secondFunction(@RequestParam("Email") String email)
    {
        ModelAndView modelAndView=new ModelAndView("second");
        modelAndView.addObject("label","Your email is "+email);
        return modelAndView;
    }

}
