package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Accessors(chain = true)
@JsonIgnoreProperties("cards")
public class Player {
    @Id
    @GeneratedValue
    private Long id;
    private String username;

    private String password;
    @ElementCollection
    @CollectionTable(name="roles")
    private List<String> roles = new ArrayList<String>();

    @OneToMany(mappedBy = "player")
    private List<Card> cards;

    public Player(String username) {
        this.username = username;
    }

    public Player (){

    }
}
