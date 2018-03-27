package com.github.szsalyi.flashcard.categories;

import com.github.szsalyi.flashcard.users.UserVO;
import lombok.Data;

@Data
public class CategoryVO {
    private long id;
    private String name;
    private UserVO user;
}
