package com.github.szsalyi.flashcard.cards;

import java.util.List;


public interface CardService {

    CardVO save(CardVO cardVO);
    List<CardVO> getAllCards();
    List<CardVO> findCardsByCategoryIdAndUsername(Long categoryId, String username);
    CardVO getCard(long id);
    void deleteCard(long id);
    //void deleteCardsByCategory(long categoryId);
}
