package com.codeup.codeupspringblog.controllers;

import com.codeup.codeupspringblog.models.Park;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

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

    @GetMapping("/parks/{user}")
    public String parks(@PathVariable String user, Model model) {
        Park p1 = new Park("Banff National Park", "Banff");
        Park p2 = new Park("Badlands National Park", "South Dakota");
        Park p3 = new Park("White Sands National Park", "New Mexico");


        List<Park> parks = new ArrayList<>();
        parks.add(p1);
        parks.add(p2);
        parks.add(p3);

//        model.addAttribute("banff", p1);
//        model.addAttribute("badlands", p2);
//        model.addAttribute("whiteSands", p3);

        model.addAttribute("user", user);
        model.addAttribute("parks", parks);


        return "/parks/index";
    }




    @RequestMapping(path = "/increment/{number}", method = RequestMethod.GET)
    @ResponseBody
    public String addOne(@PathVariable int number) {
        return number + " plus one is " + (number + 1) + "!";
    }

    @GetMapping("/join")
    public String join() {
        return "join";
    }
    @PostMapping("/join")
    public String submitCohortForm(@RequestParam String cohort, Model model) {
        model.addAttribute("cohort", cohort);
        return "join";
    }
}

