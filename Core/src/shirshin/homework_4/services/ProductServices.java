package shirshin.homework_4.services;

import shirshin.homework_4.model.Product;

import java.util.List;

public class ProductServices {

    private List<Product> products;

    public ProductServices() {
        this.products = List.of(
                new Product("Breed", 19.5),
                new Product("Milk", 45.90),
                new Product("Bananas", 79.90),
                new Product("Apple", 80.0),
                new Product("Fish", 200.0)
        );
    }

    public List<Product> getProducts() {
        return List.copyOf(products);
    }
}
