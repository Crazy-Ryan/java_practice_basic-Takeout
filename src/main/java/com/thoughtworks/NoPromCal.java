package com.thoughtworks;

public class NoPromCal extends PromCal{

    public NoPromCal(OrderList orderList) {
        super(orderList);
    }

    @Override
    public void actualCostCal() {
        actualCost = cost;
        savedCost = 0;
    }
}
