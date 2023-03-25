package service;

import entities.Product;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {
    public double filteredSum(List<Product> productList, Predicate<Product> criteria) {
        double sum = 0.0;
        for (Product product : productList) {
            if (criteria.test(product)) {
                sum += product.getPrice();
            }
        }
        return sum;
    }
}
