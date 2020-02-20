package com.thoughtworks;

import org.graalvm.compiler.lir.alloc.lsra.LinearScan;

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
    }

    public double getCost() {
        return cost;
    }

    public double getSavedCost() {
        return savedCost;
    }

    public double getActualCost() {
        return actualCost;
    }

    public abstract void actualCostCal ();
    protected void costCal(){
        double accumulator = 0;
        for(SingleDish singleDish : orderList.getList()){
            accumulator += singleDish.getPrice()*singleDish.getQuantity();
        }
        this.cost = accumulator;
    }

}
