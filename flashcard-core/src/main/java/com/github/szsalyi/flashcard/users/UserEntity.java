package com.github.szsalyi.flashcard.users;

import com.github.szsalyi.flashcard.cards.CardEntity;
import com.github.szsalyi.flashcard.categories.CategoryEntity;
import com.github.szsalyi.flashcard.common.BaseEntity;
import com.github.szsalyi.flashcard.session.SessionEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;
import java.util.Set;


@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user")
public class UserEntity extends BaseEntity {
    private static final Long serialVersionUID = 1L;

    @Column(name = "USERNAME", nullable = false)
    private String userName;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(name = "PASSWORD", nullable = false)
    private String password;

    @Column(nullable = false)
    private String email;

    private int enabled;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Role role;

    @OneToMany(mappedBy = "user")
    private Set<CategoryEntity> categories;

    @OneToMany(mappedBy = "user")
    private List<SessionEntity> sessions;
}
