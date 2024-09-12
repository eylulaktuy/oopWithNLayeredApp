package org.example.entities;

public class Product {
    private int id;
    private String name;
    private double unitPrice;

    public Product() {

    }

    public Product(int id, String _name, double unitPrice) {
        this.id = id;
        name=_name;
        this.unitPrice = unitPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String _name) {
        name = _name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}
