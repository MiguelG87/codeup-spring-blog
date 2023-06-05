package com.codeup.codeupspringblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MathController {

    @RequestMapping(path = "/add/{number1}/and/{number2}", method = RequestMethod.GET)
    @ResponseBody
    public String add(@PathVariable int number1, @PathVariable int number2) {
        return "<h1>" + number1 + " + " + number2 + " = " + (number1 + number2) + "</h1>";
    }

    @RequestMapping(path = "/subtract/{number1}/from/{number2}", method = RequestMethod.GET)
    @ResponseBody
    public String subtract(@PathVariable int number1, @PathVariable int number2) {
        return "<h1>" + number2 + " - " + number1 + " = " + (number2 - number1) + "</h1>";
    }

    @RequestMapping(path = "/multiply/{number1}/and/{number2}", method = RequestMethod.GET)
    @ResponseBody
    public String multiply(@PathVariable int number1, @PathVariable int number2) {
        return "<h1>" + number1 + " x " + number2 + " = " + (number1 * number2) + "</h1>";
    }

    @RequestMapping(path = "/divide/{number1}/by/{number2}", method = RequestMethod.GET)
    @ResponseBody
    public String divide(@PathVariable int number1, @PathVariable int number2) {
        return "<h1>" + number1 + " / " + number2 + " = " + (number1 / number2) + "</h1>";
    }
}
