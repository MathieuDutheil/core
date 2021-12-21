package com.mathieudutheil.escalade.core.entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Table(name = "voie")
public class Voie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false)
    private Integer id;

    @Column(name = "numero",nullable = true)
    @Type(type = "short")
    private Short numero;

    @Column(name = "nom", nullable = true)
    private String nom;

    @Column(name = "remarques", nullable = true)
    private String remarques;

    @Column(name = "nombres_longueur", nullable = false)
    @Type(type = "short")
    private Short nombresLongueur;

    @Column(name = "voie_equipee", nullable = false)
    @Type(type = "boolean")
    private Boolean voieEquipee;


    @ManyToOne
    @JoinColumn(name = "cotation_id", nullable = true)
    private Cotation cotation;

    @ManyToOne
    @JoinColumn(name = "secteur_id", nullable = false)
    private Secteur secteur;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Short getNumero() {
        return numero;
    }

    public void setNumero(Short numero) {
        this.numero = numero;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getRemarques() {
        return remarques;
    }

    public void setRemarques(String remarques) {
        this.remarques = remarques;
    }

    public Short getNombresLongueur() {
        return nombresLongueur;
    }

    public void setNombresLongueur(Short nombresLongueur) {
        this.nombresLongueur = nombresLongueur;
    }

    public Boolean getVoieEquipee() {
        return voieEquipee;
    }

    public void setVoieEquipee(Boolean voieEquipee) {
        this.voieEquipee = voieEquipee;
    }

    public Cotation getCotation() {
        return cotation;
    }

    public void setCotation(Cotation cotation) {
        this.cotation = cotation;
    }

    public Secteur getSecteur() {
        return secteur;
    }

    public void setSecteur(Secteur secteur) {
        this.secteur = secteur;
    }
}
