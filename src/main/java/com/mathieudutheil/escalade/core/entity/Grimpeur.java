package com.mathieudutheil.escalade.core.entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Table(name = "grimpeur")
public class Grimpeur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "nom", nullable = false)
    private String nom;

    @Column(name = "prenom", nullable = false)
    private String prenom;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "mot_de_passe", nullable = false)
    private String motDePasse;

    @Transient
    private String confirmationMotDePasse;

    @Column(name = "telephone", nullable = false)
    private String telephone;

    @Column(name = "membre_association", nullable = false)
    @Type(type = "boolean")
    private Boolean membreAssociation;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "civilite_id", nullable = false)
    private Civilite civilite;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public String getConfirmationMotDePasse() {
        return confirmationMotDePasse;
    }

    public void setConfirmationMotDePasse(String confirmationMotDePasse) {
        this.confirmationMotDePasse = confirmationMotDePasse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Boolean getMembreAssociation() {
        return membreAssociation;
    }

    public void setMembreAssociation(Boolean membreAssociation) {
        this.membreAssociation = membreAssociation;
    }

    public Civilite getCivilite() {
        return civilite;
    }

    public void setCivilite(Civilite civilite) {
        this.civilite = civilite;
    }
}
