package com.github.szsalyi.flashcard.service.user;

import lombok.Data;

@Data
public class User {

    private String userName;
    private String firstName;
    private String lastName;
    private String password;
    private String email;

}
