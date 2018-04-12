package com.github.szsalyi.flashcard.session;

import com.github.szsalyi.flashcard.categories.CategoryVO;
import com.github.szsalyi.flashcard.users.UserVO;
import lombok.Data;

import java.util.Date;

@Data
public class SessionVO {

    private long id;

    private long date;

    private CategoryVO category;

    private double percent;

    private int score;

    private UserVO user;
}

