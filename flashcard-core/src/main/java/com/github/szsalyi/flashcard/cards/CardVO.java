package com.github.szsalyi.flashcard.cards;

import com.github.szsalyi.flashcard.categories.CategoryVO;
import lombok.Data;

import java.util.Set;

@Data
public class CardVO {

    private String front;
    private String back;

    //private String description;

    private Set<CategoryVO> categories;

}
