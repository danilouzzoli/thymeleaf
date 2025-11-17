package com.spring.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.spring.thymeleaf.model.User;

@Controller
public class UserController {


    @GetMapping("variable-expression")
    public String variableExpression( Model model){

        User user = new User("Danilo", "danilo@email.it", "ADMIN", "Male");

        model.addAttribute("user", user);

        return "variable-expression";
        
    }


    @GetMapping("selection-expression")
    public String selectionExpression( Model model){

        User user = new User("Danilo", "danilo@email.it", "ADMIN", "Male");

        model.addAttribute("user", user);

        return "selection-expression";
        
    }


    @GetMapping("message-expression")
    public String messageExpression( Model model){

        return "message-expression";
        
    }


    @GetMapping("link-expression")
    public String linkExpression( Model model){


        model.addAttribute("id", 1);
        return "link-expression";
        
    }


    @GetMapping("fragment-expression")
    public String fragmentExpression( Model model){

        return "fragment-expression";
        
    }

}
