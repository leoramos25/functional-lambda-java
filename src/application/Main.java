package application;

import entities.Product;
import service.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        final List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("HD Case", 80.00));

        ProductService service = new ProductService();

        double sum = service.filteredSum(list, product -> product.getName().charAt(0) == 'T');

        System.out.printf("Sum: %.2f", sum);
    }
}
