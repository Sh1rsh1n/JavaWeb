package shirshin.homework_4.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Order {

    private Customer customer;
    private List<Product> products;
    private int discount;
    private double cost;

    public Order(Customer customer) {
        this.customer = customer;
        this.products = new ArrayList<>();
        this.discount = addDiscount();
        products.forEach(product -> this.cost = product.getPrice());
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getDiscount() {
        return discount;
    }

    private int addDiscount() {
        Discount[] discounts = Discount.values();
        return discounts[new Random().nextInt(5)].getDiscount();
    }

    @Override
    public String toString() {
        return "Order{" +
                "customer=" + customer +
                ", products=" + products +
                ", discount=" + discount +
                ", cost=" + cost +
                '}';
    }
}
