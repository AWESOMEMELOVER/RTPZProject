package com.micka.borscha.DAO;

import com.micka.borscha.Entities.Product;
import com.micka.borscha.Entities.Vendor;

import java.util.List;

public interface VendorDAO {

    //create
    void add(Vendor vendor);

    //read
    List<Vendor> getAll();

    Vendor getById(long id);

    //update
    void update(Vendor vendor);

    //delete
    void remove(Vendor vendor);
}
