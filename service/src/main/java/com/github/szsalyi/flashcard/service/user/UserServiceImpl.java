package com.github.szsalyi.flashcard.service.user;

import com.github.szsalyi.flashcard.entity.UserEntity;
import com.github.szsalyi.flashcard.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    @Qualifier("createConversionService")
     private ConversionService conversionService;

    @Override
    public void save(final UserVO userVO) {
        userRepository.save(conversionService.convert(userVO, UserEntity.class));
    }
}
