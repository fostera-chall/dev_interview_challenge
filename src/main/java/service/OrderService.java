package service;

import model.Order;

public class OrderService {

    private final DiscountService discountService = new DiscountService();

    public double calculateTotal(Order order) {
        double total = 0;

        for (double price : order.getPrices()) {
            total += price;
        }

        return discountService.applyDiscount(total, order.getDiscount());
    }

    
    public String getCustomerCity(Order order) {
        return order.getCustomer().getCity(); //i dont know how to manage null pointer exception
    }
}