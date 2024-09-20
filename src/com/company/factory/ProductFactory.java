package com.company.factory;
import com.company.models.Product;
import com.company.enums.ProductCategory;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class ProductFactory {
    private static final Random random = new Random();

    public static Map<ProductCategory, List<Product>> generateProducts() {
        return Map.of(
                ProductCategory.DAIRY, generateRandomProducts(ProductCategory.DAIRY, List.of("Milk", "Cheese", "Butter", "Cream", "Yogurt")),
                ProductCategory.FRUIT, generateRandomProducts(ProductCategory.FRUIT, List.of("Apple", "Banana", "Cherry")),
                ProductCategory.BAKERY, generateRandomProducts(ProductCategory.BAKERY, List.of("Bread", "Croissant", "Baguette", "Muffin")),
                ProductCategory.POULTRY, generateRandomProducts(ProductCategory.POULTRY, List.of("Egg", "Chicken", "Turkey")),
                ProductCategory.BEVERAGE, generateRandomProducts(ProductCategory.BEVERAGE, List.of("Beer", "Coffee", "Tea", "Soda"))
        );
    }

    private static List<Product> generateRandomProducts(ProductCategory category, List<String> itemNames) {
        List<Product> products = new ArrayList<>();
        for (String name : itemNames) {
            int repeats = 1 + random.nextInt(3);
            for (int i = 0; i < repeats; i++) {
                products.add(new Product(name, category));
            }
        }
        return products;
    }
}

