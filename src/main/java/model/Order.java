package model;

import java.util.List;

public class Order {
    private List<Double> prices;
    private Customer customer;
    private double discount; // expected: 0.1 = 10%

    public Order(List<Double> prices, Customer customer, double discount) {
        this.prices = prices;
        this.customer = customer;
        this.discount = discount;
    }

    public List<Double> getPrices() {
        return prices;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getDiscount() {
        return discount;
    }
}