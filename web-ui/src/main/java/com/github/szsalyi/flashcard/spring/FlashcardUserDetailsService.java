package com.github.szsalyi.flashcard.spring;

import com.github.szsalyi.flashcard.service.user.UserService;
import com.github.szsalyi.flashcard.service.user.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class FlashcardUserDetailsService implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(final String username) throws UsernameNotFoundException {
        UserVO user = userService.findUser(username);
        if (user == null) {
            throw new UsernameNotFoundException(username);
        }
        return new FlashcardUserDetails(user);
    }
}
