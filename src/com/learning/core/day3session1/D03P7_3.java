package com.learning.core.day3session1;
import java.util.HashSet;

class Product1 {
    private String productId;
    private String productName;

    public Product1(String productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    @Override
    public String toString() {
        return productId + " " + productName;
    }
}

public class D03P7_3 {
    public static void main(String[] args) {
        
        HashSet<Product> products = new HashSet<>();

        
        products.add(new Product("P001", "Maruti 800"));
        products.add(new Product("P002", "Maruti Zen"));
        products.add(new Product("P003", "Maruti Dezire"));
        products.add(new Product("P004", "Maruti Alto"));

        
        String searchProductId = "P003";
        boolean found = false;
        for (Product product : products) {
            if (product.getProductId().equals(searchProductId)) {
                System.out.println("Product found: " + product);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Product with ID " + searchProductId + " not found.");
        }
    }
}
