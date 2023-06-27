

import java.util.Random;

public class ShopService {

    private static int capacity = 5;
    
    private Product[] products = new Product[capacity];
    private Customer[] customers = new Customer[capacity];
    private Order[] orders = new Order[capacity];
    // private Object[][] dataBase = null;


    public ShopService() {
        products = {    
                        new Product("Milk", 100.5f, ProductCategory.PREMIUM),
                        new Product("Bread", 70.8f, ProductCategory.STANDARD),
                        new Product("Meat", 1000, ProductCategory.PREMIUM),
                        new Product("Chocolate", 225.6f, ProductCategory.PREMIUM),
                        new Product("Tea", 300, ProductCategory.STANDARD)
                    };

        customers = {
                        new Customer("Ivan", "Semenov", 25, "+79604564444", Sex.MALE),
                        new Customer("Elena", "Kolosova", 32, "+796045654232", Sex.FEMALE)
                    };

        /* dataBase = new Object[][]{
                {customers[0], products[0], 1},
                {customers[1], products[1], 2},
                {customers[0], products[2], 101},
                {customers[1], new Product("Orange", 20, ProductCategory.PREMIUM), 5},
                {new Customer("Robert", "DeNitro", 44, "+1-3445555444", Sex.MALE), products[3], 2}};*/

        orders = new Order[5];
    }
    
    
    /*
    * метод, создания заказа
    */
    public Order makePurchase(String phone, String title, int amount) throws ShopServiceException {

        Order order = new Order();
        
        for (Customer customer : customers) {
            if (customer.getPhone().equals(phone)) {
                order.setCustomer(customer);
            }
        }

        for (Product p : products) {
            if (p.getTitle().equals(title)) {
                product = p;
            }
        }
        
        if (order.getCustomer() == null) {
            throw new CustomerException("Customer with phone: " + phone + " isn't found");
        }

        if (order.getProduct() == null) {
            throw new ProductException("Product with title: " + title + " isn't found");
        }

        if ((amount > 100) || (amount < 1)) {
            throw new AmountException("Incorrect product amount");
        }
        return new Order(customer, product, amount, discount);
    }
}
