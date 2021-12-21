package com.mathieudutheil.escalade.core.entity;

import javax.persistence.*;

@Entity
@Table(name = "commentaire")
public class Commentaire {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "commentaire", nullable = false)
    private String commentaire;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "grimpeur_id",nullable = false)
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

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
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
