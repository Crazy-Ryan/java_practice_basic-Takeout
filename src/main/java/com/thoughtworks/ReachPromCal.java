package com.thoughtworks;

public class ReachPromCal extends PromCal {

    public ReachPromCal(OrderList orderList) {
        super(orderList);
        costCal();
    }

    @Override
    public void actualCostCal() {
        if(cost > 30){
            savedCost = 6;
            actualCost = cost - savedCost;
        }
    }
}
