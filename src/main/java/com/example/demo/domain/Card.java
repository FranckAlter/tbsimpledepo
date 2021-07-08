package com.example.demo.domain;

import lombok.Data;


import javax.persistence.*;


@Entity
@Data
public class Card {

    public Card(Value value, Player player) {

        this.value = value;
        this.player = player;
    }

    public Card() {

    }


    public enum Value {
        COLOR, ORDINARY, BOMB
    }

    @Id
    @GeneratedValue
    private int id;
    private Value value;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn (name="playerid",referencedColumnName="id",nullable=true,unique=false)
    private Player player;

}