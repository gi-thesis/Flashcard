package com.github.szsalyi.flashcard.users;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

@Service
public class UserEntitytoUserVOConverter implements Converter<UserEntity, UserVO> {

    @Autowired
    private DozerBeanMapper mapper;

    @Override
    public UserVO convert(final UserEntity user) {
        if (user == null) {
            return null;
        }
        return mapper.map(user, UserVO.class);
    }
}
