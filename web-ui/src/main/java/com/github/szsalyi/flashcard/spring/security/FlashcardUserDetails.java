package com.github.szsalyi.flashcard.spring.security;

import com.github.szsalyi.flashcard.service.user.UserVO;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class FlashcardUserDetails extends User {

    private final UserVO user;

    public FlashcardUserDetails(final UserVO user) {
        super(user.getUserName(), user.getPassword(), getAuthority(user));
        this.user = user;
    }

    public static List<GrantedAuthority> getAuthority(final UserVO user) {
        List<GrantedAuthority> roles = new ArrayList<>();
        roles.add(new SimpleGrantedAuthority(user.getRole().name()));
        return roles;
    }


}
