package com.github.szsalyi.flashcard.service.user;

import com.github.szsalyi.flashcard.entity.UserEntity;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

@Service
public class UserEntityConverter implements Converter<User, UserEntity>{

    @Override
    public UserEntity convert(User user) {

        UserEntity userEntity = new UserEntity();

        userEntity.setFirstName(user.getFirstName());
        userEntity.setLastName(user.getLastName());

        return userEntity;
    }
}
