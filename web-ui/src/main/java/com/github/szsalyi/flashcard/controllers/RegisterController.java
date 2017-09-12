package com.github.szsalyi.flashcard.controllers;

import com.github.szsalyi.flashcard.service.user.User;
import com.github.szsalyi.flashcard.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ssalyi on 9/9/2017.
 */

@Controller
@RequestMapping(path = "registration")
public class RegisterController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String getRegister(Model model){

        model.addAttribute("user", new User());

        return "registration";
    }

    @PostMapping
    public String postRegister(User user){

        userService.save(user);
        System.out.println(user);

        return "registration_success";
    }

}
