package com.github.szsalyi.flashcard.service.mapper.mappers;

import com.github.szsalyi.flashcard.entity.UserEntity;
import com.github.szsalyi.flashcard.service.mapper.common.Mapper;
import com.github.szsalyi.flashcard.service.user.User;
import org.dozer.DozerBeanMapper;

/**
 * Created by ssalyi on 9/17/2017.
 */
public final class UserMapper {
    private static DozerBeanMapper mapper = Mapper.getDozerBeanMapper();

    private UserMapper() {
    }

    public static UserEntity toEntity(final User user) {
        if (user == null) {
            return null;
        }
        return mapper.map(user, UserEntity.class);
    }
}
