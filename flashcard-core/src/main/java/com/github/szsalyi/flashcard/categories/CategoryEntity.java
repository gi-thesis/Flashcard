package com.github.szsalyi.flashcard.categories;

import com.github.szsalyi.flashcard.cards.CardEntity;
import com.github.szsalyi.flashcard.common.BaseEntity;
import com.github.szsalyi.flashcard.users.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Column;
import java.util.Set;

/**
 * Created by ssalyi on 8/14/2017.
 */

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "categories")
public class CategoryEntity extends BaseEntity {

    private static final Long serialVersionUID = 1L;

    @Column(nullable = false, unique = false)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USERNAME")
    private UserEntity user;

    @OneToMany(mappedBy = "category")
    private Set<CardEntity> cards;

}
