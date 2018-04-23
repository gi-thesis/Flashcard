package com.github.szsalyi.flashcard.cards;

import com.github.szsalyi.flashcard.categories.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface CardRepository extends JpaRepository <CardEntity, Long> {

    List<CardEntity> findCardEntitiesByCategoryId(Long id);

    @Transactional
    List<CardEntity> deleteAllByCategoryId(Long id);
}

