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

    @Column(nullable = false, unique = true)
    private WordEntity value;

    private Set<WordEntity> meanings;

    @ManyToMany(mappedBy = "cardEntities")
    private UserEntity userEntity;

    @Column(nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private CategoryEntity categoryEntity;

    @Column
    private LanguageEntity languageEntity;


}
