package com.github.szsalyi.flashcard.session;

import org.hsqldb.Session;

import java.util.List;

public interface SessionService {

    SessionVO save(SessionVO sessionVO);
    SessionVO get(long id);
    List<SessionVO> getAll();
    List<SessionVO> findAllByUserId(long userId);
    List<SessionVO> findAll();
}
