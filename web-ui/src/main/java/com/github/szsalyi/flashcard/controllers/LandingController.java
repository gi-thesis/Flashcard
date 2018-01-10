package com.github.szsalyi.flashcard.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/")
public class LandingController {

    @GetMapping
    public String getLanding() {
        return "landing";
    }
}
