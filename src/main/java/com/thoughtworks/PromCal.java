package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;

public abstract class PromCal {

    protected double cost;
    protected double savedCost;
    protected double actualCost;
    protected OrderList orderList;
    protected List<Dish> promDish;

    public PromCal(OrderList orderList) {
        this.orderList = orderList;
        promDish = new ArrayList<>();
        costCal();
        actualCostCal();
    }

    public double getSavedCost() {
        return savedCost;
    }

    public double getActualCost() {
        return actualCost;
    }

    public OrderList getOrderList() {
        return orderList;
    }

    public List<Dish> getPromDish() {
        return promDish;
    }

    protected void costCal() {
        double accumulator = 0;
        for (SingleDish singleDish : orderList.getList()) {
            accumulator += singleDish.getPrice() * singleDish.getQuantity();
        }
        this.cost = accumulator;
    }

    protected abstract void actualCostCal();

}
