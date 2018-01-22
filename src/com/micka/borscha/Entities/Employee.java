package com.micka.borscha.Entities;

import java.math.BigDecimal;
import java.util.Currency;

public class Employee {

    private float employeeId;
    private String name;
    private Currency fee;

    public Employee(String name, Currency fee) {
        this.name = name;
        this.fee = fee;
    }

    public Employee(float employeeId, String name, Currency fee) {
        this.employeeId = employeeId;
        this.name = name;
        this.fee = fee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Currency getFee() {
        return fee;
    }

    public void setFee(Currency fee) {
        this.fee = fee;
    }
}
