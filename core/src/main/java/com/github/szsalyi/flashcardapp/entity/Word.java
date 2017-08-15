package com.github.szsalyi.flashcardapp.entity;

import org.hibernate.annotations.JoinColumnOrFormula;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by ssalyi on 8/14/2017.
 */
public class Word implements Serializable {

    private static final Long serialVersion = 1L;

    @Column(nullable = false,unique = true)
    private String value;

    @Column(nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "language_id")
    private Language language;

    public Word() {
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }
}
