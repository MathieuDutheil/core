package com.mathieudutheil.escalade.core.entity;

import javax.persistence.*;

@Entity
@Table(name = "cotation")
public class Cotation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "cotation", nullable = false)
    private String cotation;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCotation() {
        return cotation;
    }

    public void setCotation(String cotation) {
        this.cotation = cotation;
    }
}
