package com.learning.core.day3session1;

import java.util.HashSet;
import java.util.Iterator;

class Product2{
    private String productId;
    private String productName;

    public Product2(String productId, String productName) {
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

public class D03P7_4 {
    public static void main(String[] args) {
      
        HashSet<Product> products = new HashSet<>();

       
        products.add(new Product("P001", "Maruti 800"));
        products.add(new Product("P002", "Maruti Zen"));
        products.add(new Product("P003", "Maruti Dezire"));
        products.add(new Product("P004", "Maruti Alto"));

        
        String removeProductId = "P003";
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getProductId().equals(removeProductId)) {
                iterator.remove();
                System.out.println("Product removed: " + product);
            }
        }

      
        System.out.println("\nProduct details after removal:");
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
