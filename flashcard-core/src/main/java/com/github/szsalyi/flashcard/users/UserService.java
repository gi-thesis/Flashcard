package com.github.szsalyi.flashcard.users;

import java.util.Set;

public interface UserService {

    UserVO save(UserVO userVO);

    UserVO findUser(final String userName);

}
