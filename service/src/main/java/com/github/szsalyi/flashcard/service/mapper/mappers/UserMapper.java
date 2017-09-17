package com.github.szsalyi.flashcard.service.mapper.mappers;

import com.github.szsalyi.flashcard.entity.UserEntity;
import com.github.szsalyi.flashcard.service.mapper.common.Mapper;
import com.github.szsalyi.flashcard.service.user.UserVO;
import org.dozer.DozerBeanMapper;

/**
 * Created by ssalyi on 9/17/2017.
 */
public final class UserMapper {
    private static DozerBeanMapper mapper = Mapper.getDozerBeanMapper();

    private UserMapper() {
    }

    public static UserEntity toEntity(final UserVO userVO) {
        if (userVO == null) {
            return null;
        }
        return mapper.map(userVO, UserEntity.class);
    }

    public static UserVO toVO(final UserEntity userEntity) {
        if (userEntity == null) {
            return null;
        }
        return mapper.map(userEntity, UserVO.class);
    }
}
