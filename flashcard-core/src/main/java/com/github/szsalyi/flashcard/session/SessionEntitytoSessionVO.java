package com.github.szsalyi.flashcard.session;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

@Service
public class SessionEntitytoSessionVO implements Converter<SessionEntity, SessionVO>{

    @Autowired
    private DozerBeanMapper mapper;

    @Override
    public SessionVO convert(SessionEntity sessionEntity) {
        return mapper.map(sessionEntity, SessionVO.class);
    }
}
