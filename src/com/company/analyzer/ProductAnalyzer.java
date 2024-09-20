package com.company.analyzer;
import com.company.enums.ProductCategory;
import com.company.models.Product;
import java.util.List;
import java.util.Map;

public class ProductAnalyzer {
    private Map<ProductCategory, List<Product>> productMap;

    public ProductAnalyzer(Map<ProductCategory, List<Product>> productMap) {
        this.productMap = productMap;
    }

    public void displayAllProducts() {
        System.out.println("All products:");
        productMap.values().stream()
                .flatMap(List::stream)
                .map(Product::getName)
                .forEach(System.out::println);
    }

    public void displayShortNamedProducts() {
        System.out.println("Products with names shorter than 5 characters:");
        productMap.values().stream()
                .flatMap(List::stream)
                .map(Product::getName)
                .filter(name -> name.length() < 5)
                .forEach(System.out::println);
    }

    public void countProductOccurrences(String productName) {
        long count = productMap.values().stream()
                .flatMap(List::stream)
                .map(Product::getName)
                .filter(name -> name.equalsIgnoreCase(productName))
                .count();
        System.out.println("The product " + productName + " appears " + count + " times.");
    }

    public void displayProductsStartingWith(char letter) {
        System.out.println("Products starting with " + letter + ":");
        productMap.values().stream()
                .flatMap(List::stream)
                .map(Product::getName)
                .filter(name -> name.startsWith(String.valueOf(letter)))
                .forEach(System.out::println);
    }

    public void displayDairyProducts() {
        System.out.println("All 'Dairy' products:");
        productMap.getOrDefault(ProductCategory.DAIRY, List.of())
                .stream()
                .map(Product::getName)
                .forEach(System.out::println);
    }
}
