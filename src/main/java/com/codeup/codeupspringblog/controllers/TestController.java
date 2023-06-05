package com.codeup.codeupspringblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class TestController {
    //Get Request Mapping for /test
    @GetMapping("/test")
    //Set Response content type to text/html
    @ResponseBody
    //define method that will return text/html
    public String test() {
        return "Hello Kotlin";
    }

    // /parks
    @GetMapping("/parks/{park}/{message}")
    @ResponseBody
    public String parks(@PathVariable String park, @PathVariable String message) {
        return "<h1>Welcome to " + park +  "!</h1><br><p>" + message + ".</p>";
    }

    @GetMapping("/parks")
    @ResponseBody
    public String parks() {
        return "Welcome to Jurassic Park!";
    }

    @RequestMapping(path = "/increment/{number}", method = RequestMethod.GET)
    @ResponseBody
    public String addOne(@PathVariable int number) {
        return number + " plus one is " + (number + 1) + "!";
    }

}
