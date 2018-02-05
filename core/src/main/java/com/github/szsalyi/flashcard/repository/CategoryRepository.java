package com.github.szsalyi.flashcard.repository;

import com.github.szsalyi.flashcard.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {


}
