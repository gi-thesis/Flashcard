package com.github.szsalyi.flashcard.users;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

@Service
public class UserVOtoUserEntityConverter implements Converter<UserVO, UserEntity> {

    @Autowired
    private DozerBeanMapper mapper;

    @Override
    public UserEntity convert(final UserVO user) {
        if (user == null) {
            return null;
        }
        return mapper.map(user, UserEntity.class);
    }

}
