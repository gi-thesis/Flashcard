package com.github.szsalyi.flashcard.controllers;

import com.github.szsalyi.flashcard.service.user.UserVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/")
public class LandingController {

    @GetMapping
    public String getLanding(final Model model) {
        model.addAttribute("loginUser", new UserVO());
        return "landing";
    }

    @PostMapping
    public String postLogin() { return "profile"; }
}
