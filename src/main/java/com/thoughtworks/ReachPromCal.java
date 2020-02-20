package com.thoughtworks;

public class ReachPromCal extends PromCal {

    public ReachPromCal(OrderList orderList) {
        super(orderList);
    }

    @Override
    public void actualCostCal() {
        if (cost > 30) {
            savedCost = 6;
        } else {
            savedCost = 0;
        }
        actualCost = cost - savedCost;
    }
}
