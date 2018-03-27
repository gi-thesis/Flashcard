package com.github.szsalyi.flashcard.users;

public interface UserService {

    UserVO save(UserVO userVO);

    UserVO findUser(final String userName);

}
