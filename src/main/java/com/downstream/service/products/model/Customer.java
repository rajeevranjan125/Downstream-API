package com.downstream.service.products.model;

public class Customer {

    private int id;
    private String name;
    private String status;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

    public Customer(int id, String name, String status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }
}
