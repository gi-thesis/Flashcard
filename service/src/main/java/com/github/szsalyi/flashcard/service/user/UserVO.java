package com.github.szsalyi.flashcard.service.user;

import com.github.szsalyi.flashcard.entity.enums.Role;
import lombok.Data;

import java.io.Serializable;

@Data
public class UserVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String userName;
    private String firstName;
    private String lastName;
    private String password;
    private Role role;
    private int enabled;
    private String email;

}
