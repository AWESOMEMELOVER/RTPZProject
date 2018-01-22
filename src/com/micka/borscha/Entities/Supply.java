package com.micka.borscha.Entities;

import java.util.Date;

public class Supply {

    private float supplyId;
    private Date date;

    public Supply(float supplyId, Date date) {
        this.supplyId = supplyId;
        this.date = date;
    }

    public Supply(Date date) {
        this.date = date;
    }

    public float getSupplyId() {
        return supplyId;
    }

    public void setSupplyId(float supplyId) {
        this.supplyId = supplyId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
