package com.github.szsalyi.flashcard.service.user;

import com.github.szsalyi.flashcard.entity.UserEntity;
import com.github.szsalyi.flashcard.repository.UserRepository;

public interface UserService {

    void save(User user);

}
