package shirshin.homework_4.services;

import shirshin.homework_4.exceptions.AmountException;
import shirshin.homework_4.exceptions.CustomerException;
import shirshin.homework_4.exceptions.ProductException;
import shirshin.homework_4.exceptions.ShopServiceException;
import shirshin.homework_4.models.*;

public class ShopService {

    private static int ordersIndex = 0;
    
    private Product[] products;
    private Customer[] customers;
    private Order[] orders;


    /*
    * в конструкторе инициализируем и заполняем массивы данными о покупателях и продуктах
     */
    public ShopService() {
        products = new Product[]{
                new Product("Milk", 89.5f, ProductCategory.PREMIUM),
                new Product("Bread", 50.0f, ProductCategory.STANDARD),
                new Product("Meat", 350.0f, ProductCategory.PREMIUM),
                new Product("Chocolate", 119.9f, ProductCategory.PREMIUM),
                new Product("Tea", 279.0f, ProductCategory.STANDARD)
        };

        customers = new Customer[]{
                new Customer("Ivan", "Ivanov", 22, "+79876543210", Gender.MALE),
                new Customer("Anna", "Petrova", 23, "+79123456789", Gender.FEMALE)
        };

        orders = new Order[5];
    }
    
    public Order[] getOrders() {
        return orders;
    }

    public Product[] getProducts() {
        return products;
    }

    public Customer[] getCustomers() {
        return customers;
    }

    /*
    * метод, создания заказа
    */
    public void addOrder(String nameOrSurname, String productTitle, int productAmount) throws ShopServiceException {

        Order order = new Order();

        order.setCustomer(checkCustomer(nameOrSurname));
        order.setProduct(checkProduct(productTitle));
        order.setAmount(checkAmount(productAmount));
        order.setCost();
        
        this.orders[ordersIndex++] = order;
        System.out.println(order);
    }
    
    /*
    * метод, проверяет есть ли в списке покупателей, покупатель с указанным именем или фамилией, иначе сгенерировать исключение.
    */
    private Customer checkCustomer(String nameOrSurname) {
    
        for (Customer customer : customers) {
            if (customer.getName().equals(nameOrSurname) || customer.getSurname().equals(nameOrSurname)) {
                return customer;
            }
        }
        throw new CustomerException("Customer with name or surname: " + nameOrSurname + " isn't found");
    }
    
    /*
    * метод, проверяет есть ли в списке продуктов, продукт с указанным названием, иначе сгенерировать исключение.
    */
    private Product checkProduct(String productTitle) {
    
        for (Product product: products) {
            if (product.getTitle().equals(productTitle)) {
                return product;
            }
        }
        throw new ProductException("Product with title: " + productTitle + " isn't found");
    }
    
    
    /*
    * метод проверяет количество товара в заказе
    */
    private int checkAmount(int amount) {
        if ((amount > 100) || (amount < 1)) {
            throw new AmountException("Incorrect product amount: ", amount);
        }
        return amount;
    }
}
