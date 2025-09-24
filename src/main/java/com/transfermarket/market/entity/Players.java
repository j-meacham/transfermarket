package com.transfermarket.market.entity;

import jakarta.persistence.*;

@Entity
@Table (name="players")
public class Players {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @ManyToOne
    @JoinColumn(name="clubId")
    private Club club;

    @Column(name="name")
    private String name;

    @Column(name="trensferValue")
    private long transferValue;

    @Column(name="opennessToMove")
    private int opennessToMove;

}
