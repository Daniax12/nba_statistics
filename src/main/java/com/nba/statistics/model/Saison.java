package com.nba.statistics.model;

import javax.persistence.*;

@Entity
@Table(name = "saison")
public class Saison {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idsaison")
    private String idsaison;

    @Column(name = "anneedebut")
    private Integer yearDebut;

    @Column(name = "anneefin")
    private Integer yearEnd;

    // GETTERS AND SETTERS
    public String getIdsaison() {
        return idsaison;
    }

    public void setIdsaison(String idsaison) {
        this.idsaison = idsaison;
    }

    public Integer getYearDebut() {
        return yearDebut;
    }

    public void setYearDebut(Integer yearDebut) {
        this.yearDebut = yearDebut;
    }

    public Integer getYearEnd() {
        return yearEnd;
    }

    public void setYearEnd(Integer yearEnd) {
        this.yearEnd = yearEnd;
    }
}
