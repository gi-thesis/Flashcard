package com.github.szsalyi.flashcard.cards;

import com.github.szsalyi.flashcard.categories.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CardRepository extends JpaRepository <CardEntity, Long> {

    //@Query("SELECT c FROM card c WHERE c.category_id = :categoryId")
    List<CardEntity> findCardEntitiesByCategory(CategoryEntity categoryEntity);
}

