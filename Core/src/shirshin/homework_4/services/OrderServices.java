package shirshin.homework_4.services;

import shirshin.homework_4.model.Customer;
import shirshin.homework_4.model.Order;
import shirshin.homework_4.model.Product;

public class OrderServices {

    private Order order;

    public Order createOrder(Customer customer) {
        order = new Order(customer);
        return order;
    }

    public void addProductToOrder(Product product) {
        order.getProducts().add(product);
    }

    public int showDiscount() {
        return order.getDiscount();
    }

    public double showCost() {
        return order.getCost();
    }
}
