package com.github.szsalyi.flashcardapp.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.io.Serializable;

/**
 * Created by ssalyi on 8/14/2017.
 */
public class Category implements Serializable{

    private static final Long serialVersionUID= 1L;

    @Column(nullable = false, unique = true)
    private String category;

    @Column
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "card")
    private Card card;

    public Category() {
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Card getCard() {
        return card;
    }

    public void setWord(Card card) {
        this.card = card;
    }
}
