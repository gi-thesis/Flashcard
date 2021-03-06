package com.github.szsalyi.flashcard.cards;

import com.github.szsalyi.flashcard.categories.CategoryVO;
import com.github.szsalyi.flashcard.users.UserVO;
import lombok.Data;

import java.util.Set;

@Data
public class CardVO {

    private long id;

    private String front;
    private String back;

    //private String description;

    private CategoryVO category;

}
