package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    public String bestCharge(String selectedItems) {
        OrderList orderList = new OrderDecoder(DataProvider.getDishes(), selectedItems).decode();
        ReceiptPrinter receiptPrinter = new ReceiptPrinter();
        return receiptPrinter.print(findLowestCost(orderList));
    }

    private PromCal findLowestCost(OrderList orderList) {

        List<PromCal> promList = new ArrayList<>();
        promList.add(new NoPromCal(orderList));
        promList.add(new ReachPromCal(orderList));
        promList.add(new HalfPromCal(orderList));

        PromCal promSelected = promList.get(0);
        for (PromCal prom : promList) {
            if (prom.getActualCost() < promSelected.getActualCost()) {
                promSelected = prom;
            }
        }
        return promSelected;
    }
}
