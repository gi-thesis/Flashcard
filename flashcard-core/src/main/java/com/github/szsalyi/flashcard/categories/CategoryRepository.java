package com.github.szsalyi.flashcard.categories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {

    //@Query("select c from CategoryEntity c where c.User.userName = ?1")
    //List<CategoryEntity> findCategoryEntitiesByUserUserName(String username);
    List<CategoryEntity> findCategoryEntitiesByUserUserName(String username);
}
