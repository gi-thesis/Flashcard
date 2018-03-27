package com.github.szsalyi.flashcard.users;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserVO implements Serializable {
    private static final long serialVersionUID = 1L;

    private long id;
    private String userName;
    private String firstName;
    private String lastName;
    private String password;
    private Role role;
    private int enabled;
    private String email;
}
