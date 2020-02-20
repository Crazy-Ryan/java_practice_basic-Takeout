package com.thoughtworks;

import java.util.List;

public class OrderDecoder {

    private List<Dish> dishList;
    private String selectedItems;

    public OrderDecoder(List<Dish> dishList, String selectedItems) {
        this.dishList = dishList;
        this.selectedItems = selectedItems;
    }

    private Dish findDishById(String id) {
        for (Dish dish : dishList) {
            if (id.equals(dish.getId())) {
                return dish;
            }
        }
        return null;
    }

    public OrderList decode() {

        OrderList orderList = new OrderList();
        String[] selectedItemsArr = selectedItems.split(",");
        for (String selectedItem : selectedItemsArr) {
            String[] itemIdAndCount = selectedItem.split(" x ");
            Dish dish = findDishById(itemIdAndCount[0]);
            if (dish != null) {
                orderList.addToList(new SingleDish(dish.getId(), dish.getName(), dish.getPrice(), Integer.parseInt(itemIdAndCount[1])));
            }
        }
        return orderList;

    }

}
