package com.github.szsalyi.flashcard.users;

public interface UserService {

    void save(UserVO userVO);

    UserVO findUser(final String userName);

}
