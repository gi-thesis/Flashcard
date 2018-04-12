package com.github.szsalyi.flashcard.session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SessionServiceImpl implements SessionService {

    @Autowired
    private SessionRepository  sessionRepository;

    @Autowired
    @Qualifier("createConversionService")
    private ConversionService conversionService;

    @Override
    public SessionVO save(SessionVO sessionVO) {
        SessionEntity sessionEntity = sessionRepository.save(conversionService.convert(sessionVO, SessionEntity.class));
        return conversionService.convert(sessionEntity, SessionVO.class);
    }

    @Override
    public SessionVO get(long id) {
        return conversionService.convert(sessionRepository.findOne(id), SessionVO.class);
    }

    @Override
    public List<SessionVO> getAll() {
        List<SessionVO> sessionVOS = new ArrayList<>();
        for (SessionEntity sessionEntity : sessionRepository.findAll()) {
            sessionVOS.add(conversionService.convert(sessionEntity, SessionVO.class));
        }
        return sessionVOS;
    }
/*
    @Override
    public List<SessionVO> findAllByUserId(long userId) {
        List<SessionVO> sessionVOS = new ArrayList<>();
        for (SessionEntity sessionEntity: sessionRepository.findAllByUserId(userId)) {
            sessionVOS.add(conversionService.convert(sessionEntity, SessionVO.class));
        }
        return sessionVOS;
    }*/

    @Override
    public List<SessionVO> findAllByUserId(long userId) {
        return sessionRepository.findAllByUserId(userId)
                .stream()
                .map(session -> conversionService.convert(session, SessionVO.class))
                .collect(Collectors.toList());
    }

    @Override
    public List<SessionVO> findAll() {
        return sessionRepository.findAll()
                .stream()
                .map(session -> conversionService.convert(session, SessionVO.class))
                .collect(Collectors.toList());
    }
}
