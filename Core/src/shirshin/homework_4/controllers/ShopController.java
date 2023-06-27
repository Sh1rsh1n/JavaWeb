package shirshin.homework_4.controllers;

import shirshin.homework_4.models.Customer;
import shirshin.homework_4.models.Order;
import shirshin.homework_4.models.Product;
import shirshin.homework_4.services.ShopService;

import java.util.Scanner;

public class ShopController {

    private ShopService shopService;

    private Scanner scanner;

    public ShopController() {
        shopService = new ShopService();
        scanner = new Scanner(System.in);
    }

    public void start() {

        while (true) {

            // выводим список всех покупателей
            int index = 1;
            System.out.println("\nCustomers list: ");
            for (Customer customer : shopService.getCustomers()) {
                System.out.println(index++ + ". " + customer.getName() + " " + customer.getSurname());
            }

            // выводим список всех продуктов
            System.out.println("\nProducts list");
            index = 1;
            for (Product product : shopService.getProducts()) {
                System.out.println(index++ + ". " + product.getTitle() + ": " + product.getPrice());
            }

            System.out.println("\nCreate new order: ");

            System.out.println("Write customer name or surname\n>>> ");
            String nameOrSurname = scanner.nextLine(); // запрос ввода имени или фамилии покупателя

            System.out.println("Write product title\n>>> ");
            String productTitle = scanner.nextLine(); // запрос ввода названия товара

            System.out.println("Write product amount\n>>> ");
            int productAmount = Integer.parseInt(scanner.nextLine()); // запрос ввода количества товара

            shopService.addOrder(nameOrSurname, productTitle, productAmount); // добавляем ордер в список

            System.out.println("Create one more order enter: 'y', else enter any key");
            String input = scanner.nextLine(); // запрос на повторное создание еще одного ордера

            if (!input.equalsIgnoreCase("y")) {
                int i = 1;
                for (Order order : shopService.getOrders()) {
                    System.out.println(i++ + ". " + order);
                }
                scanner.close();
                return;
            }
        }
    }
}