package com.nba.statistics.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.sql.Timestamp;

public class Tirjoueur {
    @Id
    @Column(name = "idtirjoueur", columnDefinition = "default 'SH_'||nextval('shoot_seq')")
    private String idtirjoueur;

    @ManyToOne
    @JoinColumn(name = "idplayer", referencedColumnName = "idplayer")
    private Player player;

    @ManyToOne
    @JoinColumn(name = "idgame", referencedColumnName = "idgame")
    private Game game;

    @Column(name = "dateshoot")
    private Timestamp dateShoot;

    @ManyToOne
    @JoinColumn(name = "idshoot", referencedColumnName = "idshoot")
    private Shoot shootType;

    @Column(name = "ismade")
    private Integer ismade;

    // GETTERS SETTERS
    public String getIdtirjoueur() {
        return idtirjoueur;
    }

    public void setIdtirjoueur(String idtirjoueur) {
        this.idtirjoueur = idtirjoueur;
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

    public Timestamp getDateShoot() {
        return dateShoot;
    }

    public void setDateShoot(Timestamp dateShoot) {
        this.dateShoot = dateShoot;
    }

    public Shoot getShootType() {
        return shootType;
    }

    public void setShootType(Shoot shootType) {
        this.shootType = shootType;
    }

    public Integer getIsmade() {
        return ismade;
    }

    public void setIsmade(Integer ismade) {
        this.ismade = ismade;
    }
}
