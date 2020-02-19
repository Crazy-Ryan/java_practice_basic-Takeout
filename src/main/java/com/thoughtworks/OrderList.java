package com.thoughtworks;

import java.util.ArrayList;

public class OrderList {

    private ArrayList<SingleDish> list;

    public OrderList() {
        list = new ArrayList<>();
    }

    public ArrayList<SingleDish> getList() {
        return list;
    }

    public boolean addToList(SingleDish singleDish) {
        return list.add(singleDish);
    }
}
