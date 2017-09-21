package com.github.szsalyi.flashcard.service.user;

import com.github.szsalyi.flashcard.entity.enums.Role;
import lombok.Data;

@Data
public class UserVO {

    private String userName;
    private String firstName;
    private String lastName;
    private String password;
    private Role role;
    private String email;

}
