package com.mathieudutheil.escalade.core.entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Table(name = "site_de_grimpe")
public class SiteDeGrimpe {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "nom", nullable = false)
    private String nom;

    @Column(name = "descriptif", nullable = false)
    private String descriptif;

    @Column(name = "acces", nullable = false)
    private String acces;

    @Column(name = "tagge_association", nullable = false)
    @Type(type = "boolean")
    private Boolean taggeAssociation;

    @Column(name = "lien_image", nullable = false)
    private String lienImage;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "grimpeur_id", nullable = false)
    private Grimpeur grimpeur;

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

    public String getDescriptif() {
        return descriptif;
    }

    public void setDescriptif(String descriptif) {
        this.descriptif = descriptif;
    }

    public String getAcces() {
        return acces;
    }

    public void setAcces(String acces) {
        this.acces = acces;
    }

    public Boolean getTaggeAssociation() {
        return taggeAssociation;
    }

    public void setTaggeAssociation(Boolean taggeAssociation) {
        this.taggeAssociation = taggeAssociation;
    }

    public String getLienImage() {
        return lienImage;
    }

    public void setLienImage(String lienImage) {
        this.lienImage = lienImage;
    }

    public Grimpeur getGrimpeur() {
        return grimpeur;
    }

    public void setGrimpeur(Grimpeur grimpeur) {
        this.grimpeur = grimpeur;
    }
}
