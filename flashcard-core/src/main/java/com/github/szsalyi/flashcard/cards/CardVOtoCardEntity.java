package com.github.szsalyi.flashcard.cards;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

public class CardVOtoCardEntity implements Converter<CardVO, CardEntity> {

    @Autowired
    private DozerBeanMapper mapper;

    @Override
    public CardEntity convert(CardVO cardVO) {
        return mapper.map(cardVO, CardEntity.class);
    }
}
