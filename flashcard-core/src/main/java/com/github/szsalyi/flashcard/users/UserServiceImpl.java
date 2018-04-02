package com.github.szsalyi.flashcard.users;

import com.github.szsalyi.flashcard.categories.CategoryEntity;
import com.github.szsalyi.flashcard.categories.CategoryVO;
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
    public UserVO save(final UserVO userVO) {
        System.out.println(userVO);
       UserEntity userEntity = conversionService.convert(userVO, UserEntity.class);
        return conversionService.convert(userRepository.save(userEntity), UserVO.class);
    }

    @Override
    public UserVO findUser(final String userName) {
        return conversionService.convert(userRepository.findByUserName(userName), UserVO.class);
    }
}
