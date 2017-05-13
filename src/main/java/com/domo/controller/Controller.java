package com.domo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Leo on 20/03/2017.
 */
@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping(value="/graficas", method = RequestMethod.GET)
    public ModelAndView graficas() {
        ModelAndView modelAndView = null;
        try {
            modelAndView = new ModelAndView("graficas");
        } catch(IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        return modelAndView;
    }

    @RequestMapping(value="/portada", method = RequestMethod.GET)
    public String portada() {
        return "portada";
    }


}
