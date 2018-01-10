package com.github.szsalyi.flashcard.service.user;

public interface UserService {

    void save(UserVO userVO);

    UserVO findUser(final String userName);

}
