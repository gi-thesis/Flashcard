package com.github.szsalyi.flashcard.repository;

import com.github.szsalyi.flashcard.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
