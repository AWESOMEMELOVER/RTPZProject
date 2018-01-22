package com.micka.borscha.DAO;

import com.micka.borscha.Entities.Employee;

import java.util.List;

public interface EmployeeDAO {

    //create
    void add(Employee employee);

    //read
    List<Employee> getAll();

    Employee getById(long id);

    //update
    void update(Employee employee);

    //delete
    void remove(Employee employee);




}
