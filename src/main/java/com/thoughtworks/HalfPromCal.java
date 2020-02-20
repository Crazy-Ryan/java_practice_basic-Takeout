package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;

public class HalfPromCal extends PromCal {

    public HalfPromCal(OrderList orderList) {
        super(orderList);
    }

    @Override
    public void actualCostCal() {

        double accumulator = 0;
        for (SingleDish singleDish : orderList.getList()) {
            double subtotal = singleDish.getPrice() * singleDish.getQuantity();
            if (isInPromDishList(singleDish)) {
                subtotal *= 0.5;
                promDish.add(singleDish);
            }
            accumulator += subtotal;
        }
        actualCost = accumulator;
        savedCost = cost - actualCost;
    }

    private boolean isInPromDishList(Dish dish) {
        List<String> halfDishIds = DataProvider.getHalfDishIds();
        for (String halfDishId : halfDishIds) {
            if (halfDishId.equals(dish.getId())) {
                return true;
            }
        }
        return false;
    }

}
