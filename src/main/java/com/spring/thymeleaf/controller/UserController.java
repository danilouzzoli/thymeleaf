package com.spring.thymeleaf.controller;

import java.util.ArrayList;
import java.util.List;

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

    @GetMapping("/users")
    public String users( Model model ){

        User u1 = new User("mario", "mario@email.com", "user", "male");
        User u2 = new User("maria", "maria@email.com", "user", "female");
        User u3 = new User("barbara", "barbara@email.com", "admin", "female");
        User u4 = new User("roberto", "roberto@email.com", "admin", "male");
        List users = new ArrayList<>();

        users.add(u1);
        users.add(u2);
        users.add(u3);
        users.add(u4);

        model.addAttribute("users", users);

        return "users";

    }

    @GetMapping("/if-unless")
    public String ifUnless( Model model ){

        User u1 = new User("mario", "mario@email.com", "USER", "male");
        User u2 = new User("maria", "maria@email.com", "USER", "female");
        User u3 = new User("barbara", "barbara@email.com", "ADMIN", "female");
        User u4 = new User("roberto", "roberto@email.com", "ADMIN", "male");
        List users = new ArrayList<>();

        users.add(u1);
        users.add(u2);
        users.add(u3);
        users.add(u4);

        model.addAttribute("users", users);

        return "if-unless";

    }

    @GetMapping("/switch-case")
    public String switchCase( Model model ){
        User user = new User("mario", "mario@email.com", "*", "Male");

        model.addAttribute("user", user);

        return "switch-case";
    }


}
