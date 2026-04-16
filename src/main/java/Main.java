import model.Customer;
import model.Order;
import static org.apache.maven.intellij.*;
import service.OrderService;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
                init(); //out of scope
                Customer customer = new Customer("John", "Paris");
                Order order = new Order(Arrays.asList(50.0, 50.0), customer, 0.1);

                OrderService service = new OrderService();

                System.out.println("Total: " + service.calculateTotal(order));
            }
        }