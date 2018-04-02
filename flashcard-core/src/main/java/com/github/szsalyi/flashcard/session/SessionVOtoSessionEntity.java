package com.github.szsalyi.flashcard.session;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

@Service
public class SessionVOtoSessionEntity implements Converter<SessionVO, SessionEntity>{

    @Autowired
    private DozerBeanMapper mapper;


    @Override
    public SessionEntity convert(SessionVO sessionVO) {
        return mapper.map(sessionVO, SessionEntity.class);
    }
}
