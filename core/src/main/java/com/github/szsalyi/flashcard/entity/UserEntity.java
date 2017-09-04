package com.github.szsalyi.flashcard.entity;

import com.github.szsalyi.flashcard.entity.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

/**
 * Created by ssalyi on 8/14/2017.
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user")
@Builder
public class UserEntity extends BaseEntity {

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
    List<CardEntity> cardEntities;

}
