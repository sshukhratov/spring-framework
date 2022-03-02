package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // Annotate the class with the @Controller stereotype annotation
public class HomeController {

    @RequestMapping("/home") // use to associate the action with an HTTP request path
    public String home(){
        return "home.html"; // Return html document name that contains the details we want browser to display
    }

    @RequestMapping("/welcome")
    public String welcome(){
        return "welcome.html";
    }



}
