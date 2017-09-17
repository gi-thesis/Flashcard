package com.github.szsalyi.flashcard.service.user;

import com.github.szsalyi.flashcard.repository.UserRepository;
import com.github.szsalyi.flashcard.service.mapper.mappers.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

//    @Autowired
//    private ConversionService conversionService;

    @Override
    public void save(final UserVO userVO) {
        userRepository.save(UserMapper.toEntity(userVO));
    }
}
