package shirshin.homework_4.controllers;

import shirshin.homework_4.model.Customer;
import shirshin.homework_4.model.Order;
import shirshin.homework_4.model.Product;
import shirshin.homework_4.services.CustomerServices;
import shirshin.homework_4.services.OrderServices;
import shirshin.homework_4.services.ProductServices;

import java.util.Scanner;

public class MainController {

    private CustomerServices customerServices;

    private OrderServices orderServices;

    private ProductServices productServices;

    private Scanner scanner;

    public MainController() {
        this.scanner = new Scanner(System.in);
        this.customerServices = new CustomerServices();
        this.orderServices = new OrderServices();
        this.productServices = new ProductServices();
    }

    public void runApp() {

        String input;

        while (true) {

            while (true) {
                System.out.println("Enter your name or surname");
                input = scanner.nextLine();

                for (Customer customer : customerServices.getCustomers()) {
                    if (customer.getFullName().contains(input)) {
                        orderServices.createOrder(customer);
                        return;
                    }
                }

                System.out.println("add products in your order from list: ");

                int i = 0;

                for (Product product: productServices.getProducts()) {
                    System.out.println(++i + " " + product);
                }

                input = scanner.nextLine();

                if (Integer.parseInt(input) - 1 >= 0 && Integer.parseInt(input) - 1 < productServices.getProducts().size()) {
                    orderServices.addProductToOrder(productServices.getProducts().get(Integer.parseInt(input)));
                }

                System.out.println("incorrect product value, try again");


            }
        }
    }
}
