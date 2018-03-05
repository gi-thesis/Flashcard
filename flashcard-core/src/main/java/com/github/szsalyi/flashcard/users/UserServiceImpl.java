package com.github.szsalyi.flashcard.users;

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

    @Override
    public UserVO findUser(final String userName) {
        return conversionService.convert(userRepository.findByUserName(userName), UserVO.class);
    }
}
