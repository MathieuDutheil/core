package com.mathieudutheil.escalade.core.entity;

import javax.persistence.*;

@Entity
@Table(name = "secteur")
public class Secteur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "nom", nullable = false)
    private String nom;

    @Column(name = "temps_de_marche", nullable = true)
    private String tempsDeMarche;

    @Column(name = "altitude", nullable = true)
    private String altitude;

    @ManyToOne
    @JoinColumn(name = "site_de_grimpe_id", nullable = false)
    private SiteDeGrimpe siteDeGrimpe;

}
