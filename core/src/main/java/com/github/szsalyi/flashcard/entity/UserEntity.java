package com.github.szsalyi.flashcard.entity;

import com.github.szsalyi.flashcard.entity.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.ManyToMany;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Enumerated;
import javax.persistence.JoinTable;
import javax.persistence.EnumType;
import java.util.List;
import java.util.Set;

/**
 * Created by ssalyi on 8/14/2017.
 */

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user")
public class UserEntity extends BaseEntity {

    private static final Long serialVersionUID = 1L;

    @Column(nullable = false)
    private String userName;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false, insertable = true, updatable = true)
    @ElementCollection(targetClass = Role.class)
    @Enumerated(EnumType.STRING)
     private Set<Role> roles;

    @ManyToMany
    @JoinTable(name = "user_cards")
    private List<CardEntity> cardEntities;

}
