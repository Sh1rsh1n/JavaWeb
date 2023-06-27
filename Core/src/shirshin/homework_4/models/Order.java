package shirshin.homework_4.models;


import shirshin.homework_4.exceptions.TooMuchSaleException;

import java.util.Random;

public class Order {

    private Customer customer;
    private Product product;
    private int amount;
    private float cost;
    private int discount;
    
    public Order(){
        randomDiscount();
    }

    public Order(Customer customer, Product product, int amount) {
        this.customer = customer;
        this.product = product;
        this.amount = amount;
        randomDiscount();
        setCost();
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public float getCost() {
        return cost;
    }
    
    /*
    * расчет стоимости всех заказов с учетом скидки
    */
    public void setCost() throws TooMuchSaleException {
        if (product.getProductCategory().equals(ProductCategory.PREMIUM) && discount > 15) {
            throw new TooMuchSaleException("Discount is too much!");
        } 
        
        float fullPrice = product.getPrice() * amount;
        cost = Math.round((fullPrice - fullPrice * discount / 100) * 100.0) / 100.0f;
    } 
    
    /*
    * выбор случайного % скидки на заказ
    */
    private void randomDiscount() {
        Discount[] discounts = Discount.values();
        discount = discounts[new Random().nextInt(5)].getDiscount();
        System.out.println("Your discount: " + discount);
    }

    @Override
    public String toString() {
        return "Order{" +
                "customer=" + customer.getName() + " " + customer.getSurname() +
                ", product=" + product.getTitle() + " price: " + product.getPrice() +
                ", amount=" + amount +
                ", cost=" + cost +
                ", discount=" + discount +
                '}';
    }
}
