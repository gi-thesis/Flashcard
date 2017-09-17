package com.github.szsalyi.flashcard.service.user;

import lombok.Data;

@Data
public class UserVO {

    private String userName;
    private String firstName;
    private String lastName;
    private String password;
    private String email;

}
