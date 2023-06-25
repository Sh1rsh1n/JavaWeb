package shirshin.homework_4.services;

import shirshin.homework_4.model.Customer;
import shirshin.homework_4.model.Gender;

import java.util.List;

public class CustomerServices {

    private List<Customer> customers;

    public CustomerServices() {
        this.customers = List.of(
                new Customer("Petr Ivanov", 26, "+79091234567", Gender.MALE),
                new Customer("Masha Petrova", 33, "+79561234567", Gender.FEMALE),
                new Customer("Egor Popov", 40, "+79061234567", Gender.MALE),
                new Customer("Aleksei Alekseev", 23, "+79957894561", Gender.MALE),
                new Customer("Anna Smirnova", 32, "+79876543210", Gender.FEMALE));
    }

    public List<Customer> getCustomers() {
        return List.copyOf(customers);
    }
}
