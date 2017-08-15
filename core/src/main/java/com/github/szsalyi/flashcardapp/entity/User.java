package com.github.szsalyi.flashcardapp.entity;

import com.github.szsalyi.flashcardapp.entity.enums.Role;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by ssalyi on 8/14/2017.
 */
public class User implements Serializable {

    private static final Long serailVersionUID = 1L;

    @Column(nullable = false)
    private String fName;

    @Column(nullable = false)
    private String lName;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    List<Role> roles;

    @ManyToMany
    @JoinTable(name = "user_cards")
    List<Card> cards;

    public User() {
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }
}
