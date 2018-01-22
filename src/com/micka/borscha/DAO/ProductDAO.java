package com.micka.borscha.DAO;

import com.micka.borscha.Entities.Employee;
import com.micka.borscha.Entities.Product;

import java.util.List;

public interface ProductDAO {

    //create
    void add(Product product);

    //read
    List<Product> getAll();

    Product getById(long id);

    //update
    void update(Product product);

    //delete
    void remove(Product product);

}
