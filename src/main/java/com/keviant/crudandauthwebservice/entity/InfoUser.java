package com.keviant.crudandauthwebservice.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "info_users")
public class InfoUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int attemptOne;
    private int attemptTwo;
    private int attemptThree;
    private int attemptFour;
    private int attemptFive;
    private int attemptSix;

    @ElementCollection
    @Column(name = "words", length = 5)
    @CollectionTable(name = "info_users_word", joinColumns = @JoinColumn(name = "owner_id"))
    private Collection<String> words = new ArrayList<>();

    public Long getResourceId(){
        return id;
    }
}
