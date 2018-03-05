package com.github.szsalyi.flashcard.api;

import com.github.szsalyi.flashcard.response.Result;
import com.github.szsalyi.flashcard.service.user.UserService;
import com.github.szsalyi.flashcard.service.user.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/users", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class UserAPIController {

    @Autowired
    private UserService userService;

    @GetMapping(path = "/exists")
    public Result<Boolean> getUser(@RequestParam final String username) {
        Result<Boolean> result = new Result<>();
        if (userService.findUser(username) != null) {
            result.setData(true);
        } else {
            result.setData(false);
        }
        return result;
    }

    @PostMapping
    public ResponseEntity<Boolean> saveUser(final UserVO userVO) {
        userService.save(userVO);
        return ResponseEntity.status(201).build();
    }
}
