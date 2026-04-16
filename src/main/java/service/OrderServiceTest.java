package service;

import model.Customer;
import model.Order;
import service.OrderService;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderServiceTest {

    @Test
    void shouldCalculateTotal() {
        Customer customer = new Customer("Alice", "London");
        Order order = new Order(Arrays.asList(50.0, 50.0), customer, 0.1);

        OrderService service = new OrderService();

        assertEquals(99.9, service.calculateTotal(order), 0.01); //incorrect expectation (passes with wrong logic)
    }
}