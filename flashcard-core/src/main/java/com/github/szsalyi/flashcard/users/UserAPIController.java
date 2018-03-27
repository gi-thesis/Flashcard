package com.github.szsalyi.flashcard.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping(path = "/api/users",
    produces = MediaType.APPLICATION_JSON_UTF8_VALUE,
    consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class UserAPIController {

    @Autowired
    private UserService userService;


    @GetMapping(path = "/user", consumes = MediaType.ALL_VALUE)
    public ResponseEntity<Principal> user(Principal user) {
        if(user != null) {
            return ResponseEntity.ok(user);
        }
        return ResponseEntity.badRequest().build();
    }

    @GetMapping(path = "/exists", consumes = MediaType.ALL_VALUE)
    public ResponseEntity<Boolean> getUser(@RequestParam final String userName) {
        if (userService.findUser(userName) != null) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.badRequest().build();
        }
    }

    @PostMapping
    public ResponseEntity<UserVO> saveUser(final @RequestBody UserVO user) {
        user.setRole(Role.USER);
        user.setEnabled(1);

        return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(user));
    }
}
