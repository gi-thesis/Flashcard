package com.github.szsalyi.flashcard.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by ssalyi on 8/14/2017.
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "card")
public class CardEntity extends BaseEntity {

    private static final Long serialVersionUID = 1L;

    @OneToOne
    @JoinColumn(name = "word_id")
    private WordEntity value;

    @OneToMany(mappedBy = "card")
    private Set<WordEntity> meanings;

    @ManyToMany(mappedBy = "cardEntities")
    private Set<UserEntity> user;

    @ManyToOne(fetch = FetchType.LAZY)
    private CategoryEntity category;

    @ManyToOne
    @JoinColumn(name = "language_id")
    private LanguageEntity language;


}
