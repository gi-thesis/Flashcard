package com.github.szsalyi.flashcard.cards;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

public class CardEntitytoCardVO implements Converter<CardEntity, CardVO> {

    @Autowired
    private DozerBeanMapper mapper;

    @Override
    public CardVO convert(final CardEntity cardEntity) {
        return mapper.map(cardEntity, CardVO.class);
    }
}
