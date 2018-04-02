package com.github.szsalyi.flashcard.users;

import com.github.szsalyi.flashcard.session.SessionVO;
import lombok.Data;
import org.hsqldb.Session;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

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
