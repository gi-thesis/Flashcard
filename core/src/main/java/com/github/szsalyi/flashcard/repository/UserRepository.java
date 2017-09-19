package com.github.szsalyi.flashcard.repository;

import com.github.szsalyi.flashcard.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
