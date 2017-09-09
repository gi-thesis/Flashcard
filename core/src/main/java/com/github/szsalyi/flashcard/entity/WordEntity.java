package com.github.szsalyi.flashcard.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Created by ssalyi on 8/14/2017.
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "word")
public class WordEntity extends BaseEntity {

    private static final Long serialVersion = 1L;

    @Column(nullable = false,unique = true)
    private String value;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "language_id")
    private LanguageEntity languageEntity;

}
