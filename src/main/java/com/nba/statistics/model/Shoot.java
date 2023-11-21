package com.nba.statistics.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "shoot")
public class Shoot {

    @Id
    @Column(name = "idshoot")
    private String idshoot;

    @Column(name = "nameshoot")
    private String nameShoot;

    @Column(name = "valueshoot")
    private Integer valueShoot;

    // GETTERS AND SETTERS
    public String getIdshoot() {
        return idshoot;
    }

    public void setIdshoot(String idshoot) {
        this.idshoot = idshoot;
    }

    public String getNameShoot() {
        return nameShoot;
    }

    public void setNameShoot(String nameShoot) {
        this.nameShoot = nameShoot;
    }

    public Integer getValueShoot() {
        return valueShoot;
    }

    public void setValueShoot(Integer valueShoot) {
        this.valueShoot = valueShoot;
    }
}
