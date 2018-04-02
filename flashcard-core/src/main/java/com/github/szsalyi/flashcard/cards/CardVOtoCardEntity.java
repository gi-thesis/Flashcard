package com.github.szsalyi.flashcard.cards;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

@Service
public class CardVOtoCardEntity implements Converter<CardVO, CardEntity> {

    @Autowired
    private DozerBeanMapper mapper;

    @Override
    public CardEntity convert(CardVO cardVO) {
        return mapper.map(cardVO, CardEntity.class);
    }
}
