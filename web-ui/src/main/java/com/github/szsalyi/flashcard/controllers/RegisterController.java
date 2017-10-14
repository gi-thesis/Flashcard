package com.github.szsalyi.flashcard.controllers;

import com.github.szsalyi.flashcard.entity.enums.Role;
import com.github.szsalyi.flashcard.service.user.UserVO;
import com.github.szsalyi.flashcard.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "registration")
public class RegisterController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String getRegister(final Model model) {

        model.addAttribute("user", new UserVO());

        return "registration";
    }

    @PostMapping
    public String postRegister(final UserVO user) {
        user.setRole(Role.USER);
        user.setEnabled(1);
        userService.save(user);
        System.out.println(user);

        return "registration_success";
    }

}
