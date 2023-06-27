

import java.util.Random;

public class ShopService {

    private final static int capacity = 5;
    
    private static int ordersIndex = 0;
    
    private Product[] products = new Product[capacity];
    private Customer[] customers = new Customer[capacity];
    private Order[] orders = new Order[capacity];
    // private Object[][] dataBase = null;


    public ShopService() {
        products = {    
                        new Product("Milk", 89.5f, ProductCategory.PREMIUM),
                        new Product("Bread", 50.0f, ProductCategory.STANDARD),
                        new Product("Meat", 350.0f, ProductCategory.PREMIUM),
                        new Product("Chocolate", 119.9f, ProductCategory.PREMIUM),
                        new Product("Tea", 279.0f, ProductCategory.STANDARD)
                    };

        customers = {
                        new Customer("Ivan", "Ivanov", 22, "+79876543210", Gender.MALE),
                        new Customer("Anna", "Petrova", 23, "+79123456789", Gender.FEMALE)
                    };

        /* dataBase = new Object[][]{
                {customers[0], products[0], 1},
                {customers[1], products[1], 2},
                {customers[0], products[2], 101},
                {customers[1], new Product("Orange", 20, ProductCategory.PREMIUM), 5},
                {new Customer("Robert", "DeNitro", 44, "+1-3445555444", Sex.MALE), products[3], 2}};*/

        orders = new Order[5];
    }
    
    public Order[] getOrders() {
        return orders;
    }
    
    /*
    * метод, создания заказа
    */
    public void addOrder(String phone, String title, int amount) throws ShopServiceException {

        Order order = new Order();

        order.setCustomer(checkCustomer(phone));
        order.setProduct(checkProduct(title));
        order.setAmount(chechAmount(amount));
        order.setCost();
        
        this.orders[orderIndex++] = order;
    }
    
    /*
    * метод, проверяет есть ли в списке покупателей, покупатель с указанным телефоном, иначе сгенерировать исключение.
    */
    private Customer checkCustomer(String phone) {
    
        for (Customer customer : customers) {
            if (customer.getPhone().equals(phone)) {
                return customer;
            }
        }
        throw new CustomerException("Customer with phone: " + phone + " isn't found");
    }
    
    /*
    * метод, проверяет есть ли в списке продуктов, продукт с указанным названием, иначе сгенерировать исключение.
    */
    private Product checkProduct(String title) {
    
        for (Product product: products) {
            if (product.getTitle().equals(title)) {
                return product;
            }
        }
        throw new ProductException("Product with title: " + title + " isn't found");
    }
    
    
    /*
    * метод проверяет количество товара в заказе
    */
    private int chechAmount(int amount) {
        if ((amount > 100) || (amount < 1)) {
            throw new AmountException("Incorrect product amount");
        }
        return amount;
    }
}
