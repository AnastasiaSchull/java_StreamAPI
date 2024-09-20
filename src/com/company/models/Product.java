package com.company.models;
import com.company.enums.ProductCategory;

public class Product {
    private String name;
    private ProductCategory category;

    public Product(String name, ProductCategory category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public ProductCategory getCategory() {
        return category;
    }
}
