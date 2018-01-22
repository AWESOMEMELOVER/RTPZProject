package com.micka.borscha.Entities;

import java.io.Serializable;

public class Vendor {

    private float vendorId;
    private String title;

    Vendor(float vendorId,String title){
        this.vendorId = vendorId;
        this.title = title;
    }

    public Vendor(String title) {
        this.title = title;
    }

    public float getVendorId() {
        return vendorId;
    }

    public void setVendorId(float vendorId) {
        this.vendorId = vendorId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
