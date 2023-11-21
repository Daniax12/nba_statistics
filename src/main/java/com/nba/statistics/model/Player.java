package com.nba.statistics.model;

import javax.persistence.*;

@Entity
@Table(name = "player")
public class Player {
    @Id
    @Column(name = "idplayer")
    private String idplayer;
    @Column(name = "nameteam")
    private String namePlayer;

    @Column(name = "numPlayer")
    private Integer numPlayer;

    @ManyToOne
    @JoinColumn(name = "idteam", referencedColumnName = "idteam")
    private Team playerTeam;

    /*
    PRENDRE LES POINTS D'UN JOUEUR DANS UN MATCH
     */

    public int getMyPoint(Game game){
        int result = 0;


        return result;
    }


    // GETTER AND SETTER
    public String getIdplayer() {
        return idplayer;
    }

    public void setIdplayer(String idplayer) {
        this.idplayer = idplayer;
    }

    public String getNamePlayer() {
        return namePlayer;
    }

    public void setNamePlayer(String namePlayer) {
        this.namePlayer = namePlayer;
    }

    public Integer getNumPlayer() {
        return numPlayer;
    }

    public void setNumPlayer(Integer numPlayer) {
        this.numPlayer = numPlayer;
    }

    public Team getPlayerTeam() {
        return playerTeam;
    }

    public void setPlayerTeam(Team playerTeam) {
        this.playerTeam = playerTeam;
    }
}
