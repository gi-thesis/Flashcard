package com.github.szsalyi.flashcard.controllers;

import com.github.szsalyi.flashcard.service.user.UserVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/login")
public class LoginController {

    @GetMapping
    public String getLogin(final Model model) {
        model.addAttribute("loginUser", new UserVO());
        return "login";
    }

    @PostMapping
    public String postLogin() { return "profile"; }
}
