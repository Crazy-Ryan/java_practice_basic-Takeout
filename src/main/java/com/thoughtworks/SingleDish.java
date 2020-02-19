package com.thoughtworks;

public class SingleDish extends Dish {

    private int quantity;

    public SingleDish(String id, String name, double price, int quantity) {
        super(id, name, price);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

}
