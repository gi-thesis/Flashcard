package com.github.szsalyi.flashcard.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ssalyi on 9/9/2017.
 */

@Controller
@RequestMapping(path = "registration")
public class RegisterController {

    @GetMapping
    public String getRegister(){



        return "registration";
    }

}
