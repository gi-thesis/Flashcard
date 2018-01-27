package com.github.szsalyi.flashcard.spring;

import com.github.szsalyi.flashcard.service.user.UserVO;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.ArrayList;
import java.util.List;

@Data
public class FlashcardUserDetails extends User {

    private UserVO user;

    public FlashcardUserDetails(final UserVO user) {
        super(user.getUserName(), user.getPassword(), getAuthority(user));
        this.user = user;
    }

    public static List<GrantedAuthority> getAuthority(UserVO user){
        List<GrantedAuthority> roles = new ArrayList<>();
        roles.add(new SimpleGrantedAuthority(user.getRole().name()));
        return roles;
    }


}
