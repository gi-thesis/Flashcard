package com.github.szsalyi.flashcardapp.entity;

import org.hibernate.annotations.JoinColumnOrFormula;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/**
 * Created by ssalyi on 8/14/2017.
 */
public class Card implements Serializable {

    private static final Long serialVersionUID = 1L;

    @Column(nullable = false, unique = true)
    private Map<Word,Set<Word>> element;

    @ManyToMany(mappedBy = "cards")
    private User user;

    @Column(nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;

    @Column
    private Language language;

    public Card() {
    }

    public Map<Word, Set<Word>> getElement() {
        return element;
    }

    public void setElement(Map<Word, Set<Word>> element) {
        this.element = element;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Language getLanguage() {
        return language;
    }

    //TODO set language automatically when the card is created
    public void setLanguage(Language language) {
        this.language = language;
    }
}
