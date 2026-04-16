package service;

public class DiscountService {
    public double applyDiscount(double total, double discount) {
        if (discount > 0) {
            return total - discount; // should be percentage but i dont know how to do it :)
        }
        return total;
    }
}