package com.micka.borscha.DAO;

import com.micka.borscha.Entities.Product;
import com.micka.borscha.Entities.Supply;

import java.util.List;

public interface SupplyDAO {

    //create
    void add(Supply supply);

    //read
    List<Supply> getAll();

    Supply getById(long id);

    //update
    void update(Supply supply);

    //delete
    void remove(Supply supply);

}
