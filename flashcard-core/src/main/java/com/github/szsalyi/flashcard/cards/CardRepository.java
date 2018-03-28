package com.github.szsalyi.flashcard.cards;

import com.github.szsalyi.flashcard.categories.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CardRepository extends JpaRepository <CardEntity, Long> {

    List<CardEntity> findCardEntitiesByCategoryId(Long categoryId);
}
