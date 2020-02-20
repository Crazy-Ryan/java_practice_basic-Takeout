package com.thoughtworks;

public class ReceiptPrinter {
    public String print(PromCal prom) {
        StringBuilder output = new StringBuilder();
        output.append("============= 订餐明细 =============\n");
        for (SingleDish dish : prom.getOrderList().getList()) {
            output.append(dish.getName()).append(" x ").append(dish.getQuantity()).append(" = ")
                    .append((int) (dish.getQuantity() * dish.getPrice())).append("元\n");
        }
        output.append("-----------------------------------\n");
        if (prom instanceof ReachPromCal) {
            output.append("使用优惠:\n").append("满30减6元，省")
                    .append((int) prom.getSavedCost()).append("元\n")
                    .append("-----------------------------------\n");
        } else if (prom instanceof HalfPromCal) {
            output.append("使用优惠:\n").append("指定菜品半价(");
            boolean firstDishFlag = true;
            for (Dish promDish : prom.getPromDish()) {
                if (firstDishFlag) {
                    firstDishFlag = false;
                } else {
                    output.append("，");
                }
                output.append(promDish.getName());

            }
            output.append(")，省").append((int) prom.getSavedCost()).append("元\n")
                    .append("-----------------------------------\n");
        }
        output.append("总计：").append((int) prom.getActualCost()).append("元\n");
        output.append("===================================");
        return output.toString();
    }
}
