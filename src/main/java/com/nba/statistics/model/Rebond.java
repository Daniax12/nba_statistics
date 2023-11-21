package com.nba.statistics.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "rebond")
public class Rebond {
    @Id
    @Column(name = "idrebond", columnDefinition = "default 'RE_'||nextval('rebond_seq')")
    private String idrebond;

    @ManyToOne
    @JoinColumn(name = "idplayer", referencedColumnName = "idplayer")
    private Player player;

    @ManyToOne
    @JoinColumn(name = "idgame", referencedColumnName = "idgame")
    private Game game;

    @Column(name = "dateRebond")
    private Timestamp dateRebond;

    @Column(name = "typeRebond")
    private Integer typeRebond;


    // GETTERS AND SETTERS
    public String getIdrebond() {
        return idrebond;
    }

    public void setIdrebond(String idrebond) {
        this.idrebond = idrebond;
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

    public Timestamp getDateRebond() {
        return dateRebond;
    }

    public void setDateRebond(Timestamp dateRebond) {
        this.dateRebond = dateRebond;
    }

    public Integer getTypeRebond() {
        return typeRebond;
    }

    public void setTypeRebond(Integer typeRebond) {
        this.typeRebond = typeRebond;
    }
}
