package com.github.szsalyi.flashcardapp.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by ssalyi on 8/14/2017.
 */
public class Language implements Serializable {

    private static final Long serialVersionUID = 1L;

    @Column(nullable = false,unique = true)
    private String language;

    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL, mappedBy = "language")
    private Word word;

    public Language() {
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Word getWord() {
        return word;
    }

    public void setWord(Word word) {
        this.word = word;
    }
}
