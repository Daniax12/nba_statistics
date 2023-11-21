package com.nba.statistics.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "game")
public class Game {

    @Id
    @Column(name = "idgame", columnDefinition = "default 'GA_'||nextval('game_seq')")
    private String idgame;

    @ManyToOne
    @JoinColumn(name = "idteam1", referencedColumnName = "idteam")
    private Team team1;

    @ManyToOne
    @JoinColumn(name = "idteam2", referencedColumnName = "idteam")
    private Team team2;

    @Column(name = "dateGame")
    private Timestamp dateGame;

    @Column(name = "typeGame")
    private Integer typeGame;

    @ManyToOne
    @JoinColumn(name = "idsaison", referencedColumnName = "idsaison")
    private  Saison saison;



    // GETTERS SETTERS
    public String getIdgame() {
        return idgame;
    }

    public void setIdgame(String idgame) {
        this.idgame = idgame;
    }

    public Team getTeam1() {
        return team1;
    }

    public void setTeam1(Team team1) {
        this.team1 = team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public void setTeam2(Team team2) {
        this.team2 = team2;
    }

    public Timestamp getDateGame() {
        return dateGame;
    }

    public void setDateGame(Timestamp dateGame) {
        this.dateGame = dateGame;
    }

    public Integer getTypeGame() {
        return typeGame;
    }

    public void setTypeGame(Integer typeGame) {
        this.typeGame = typeGame;
    }

    public Saison getSaison() {
        return saison;
    }

    public void setSaison(Saison saison) {
        this.saison = saison;
    }
}
