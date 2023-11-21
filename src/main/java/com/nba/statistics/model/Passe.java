package com.nba.statistics.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.sql.Timestamp;

public class Passe {
    @Id
    @Column(name = "idpasse", columnDefinition = "default 'PAS_'||nextval('passe_seq')")
    private String idpasse;

    @ManyToOne
    @JoinColumn(name = "idplayer", referencedColumnName = "idplayer")
    private Player player;

    @ManyToOne
    @JoinColumn(name = "idgame", referencedColumnName = "idgame")
    private Game game;

    @Column(name = "datePasse")
    private Timestamp datePasse;


    // GETTERS AND SETTERS
    public String getIdpasse() {
        return idpasse;
    }

    public void setIdpasse(String idpasse) {
        this.idpasse = idpasse;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Timestamp getDatePasse() {
        return datePasse;
    }

    public void setDatePasse(Timestamp datePasse) {
        this.datePasse = datePasse;
    }
}
