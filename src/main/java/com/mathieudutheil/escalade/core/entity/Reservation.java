package com.mathieudutheil.escalade.core.entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "reservation")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = true)
    private Integer id;

    //TODO voir pour mapper attribut et ajouter @Type
    @Column(name = "date_reservation", nullable = false)
    @Type(type = "java.util.Date")
    private Date dateReservation;

    @ManyToOne
    @JoinColumn(name = "topo_id",nullable = false)
    private Topo topo;

    @ManyToOne
    @JoinColumn(name = "statut_id",nullable = false)
    private Statut statut;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(Date dateReservation) {
        this.dateReservation = dateReservation;
    }

    public Topo getTopo() {
        return topo;
    }

    public void setTopo(Topo topo) {
        this.topo = topo;
    }

    public Statut getStatut() {
        return statut;
    }

    public void setStatut(Statut statut) {
        this.statut = statut;
    }
}
