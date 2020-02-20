package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;

public class OrderList {

    private List<SingleDish> list;

    public OrderList() {
        list = new ArrayList<>();
    }

    public List<SingleDish> getList() {
        return list;
    }

    public boolean addToList(SingleDish singleDish) {
        return list.add(singleDish);
    }
}
