package com.github.szsalyi.flashcard.cards;

import com.github.szsalyi.flashcard.categories.CategoryEntity;
import com.github.szsalyi.flashcard.categories.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CardServiceImpl implements CardService{

    @Autowired
    private CardRepository cardRepository;

    @Autowired
    @Qualifier("createConversionService")
    private ConversionService conversionService;

    @Override
    public CardVO save(CardVO cardVO) {
        CardEntity cardEntity = cardRepository.save(conversionService.convert(cardVO, CardEntity.class));
        cardEntity.setCategory(conversionService.convert(cardVO.getCategory(), CategoryEntity.class));
        return conversionService.convert(cardEntity, CardVO.class);
    }

    @Override
    public List<CardVO> getAllCards() {
        List<CardVO> cards = new ArrayList<>();
        for ( CardEntity cardEntity : cardRepository.findAll()) {
            cards.add(conversionService.convert(cardEntity, CardVO.class));
        }
        return cards;
    }

    @Override
    public List<CardVO> findCardsByCategoryId(Long categoryId) {
        List<CardVO> cards = new ArrayList<>();
        for ( CardEntity cardEntity : cardRepository.findCardEntitiesByCategoryId(categoryId)) {
            cards.add(conversionService.convert(cardEntity, CardVO.class));
        }
        return cards;
    }

    @Override
    public CardVO getCard(long id) {
        return conversionService.convert(cardRepository.findOne(id), CardVO.class);
    }

    @Override
    public void deleteCard(long id) {
        cardRepository.delete(id);
    }
}
