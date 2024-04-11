package desafio.desafio22;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Computer", 5000, 1);
        Product product2 = new Product("Keyboard", 200, 2);
        ArrayList<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        System.out.println(products.size());
        System.out.println(products);
        for (Product product : products) {
            System.out.println(product);
        }
        PerecibleProduct perecibleProduct = new PerecibleProduct("Mouse", 150, 5, "2024-01-12");
        System.out.println(perecibleProduct);
    }
}
