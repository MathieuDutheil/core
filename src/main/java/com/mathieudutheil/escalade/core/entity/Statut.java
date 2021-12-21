package com.mathieudutheil.escalade.core.entity;

import javax.persistence.*;

@Entity
@Table(name = "statut")
public class Statut {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "statut", nullable = false)
    private String statut;
}
