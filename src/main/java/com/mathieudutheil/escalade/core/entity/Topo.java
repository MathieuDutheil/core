package com.mathieudutheil.escalade.core.entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;

import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "topo")
public class Topo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "nom", nullable = false)
    private String nom;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "lieu", nullable = false)
    private String lieu;

    //TODO voir pour mapper attribut et ajouter @Type
    @Column(name = "date_de_parution", nullable = false)
    @Type(type = "java.util.Date")
    private Date dateDeParution;

   @Column(name = "disponible", nullable = false)
   @Type(type = "boolean")
    private Boolean disponible;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "grimpeur_id", nullable = false)
    private Grimpeur grimpeur;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "site_de_grimpe_id", nullable = false)
    private SiteDeGrimpe siteDeGrimpe;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public Date getDateDeParution() {
        return dateDeParution;
    }

    public void setDateDeParution(Date dateDeParution) {
        this.dateDeParution = dateDeParution;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }

    public Grimpeur getGrimpeur() {
        return grimpeur;
    }

    public void setGrimpeur(Grimpeur grimpeur) {
        this.grimpeur = grimpeur;
    }

    public SiteDeGrimpe getSiteDeGrimpe() {
        return siteDeGrimpe;
    }

    public void setSiteDeGrimpe(SiteDeGrimpe siteDeGrimpe) {
        this.siteDeGrimpe = siteDeGrimpe;
    }
}
