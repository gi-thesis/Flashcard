package com.github.szsalyi.flashcard.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
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
@Builder
@Table(name = "category")
public class CategoryEntity extends BaseEntity{

    private static final Long serialVersionUID= 1L;

    @Column(nullable = false, unique = true)
    private String category;


    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private CardEntity cardEntity;

}
