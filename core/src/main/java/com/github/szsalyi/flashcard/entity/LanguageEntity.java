package com.github.szsalyi.flashcard.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;


/**
 * Created by ssalyi on 8/14/2017.
 */

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "language")
public class LanguageEntity extends BaseEntity {

    private static final Long serialVersionUID = 1L;

    @Column(nullable = false, unique = true)
    private String language;

//    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL, mappedBy = "language")
//    private Set<WordEntity> wordEntity;



}
