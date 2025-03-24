package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- WELCOME TO PRODUCT MANAGEMENT APPLICATION ---");

        ProductService productService = new ProductService();

        System.out.println("__________________________________________________________________________");
        // Getting all products
        List<Product> allProducts = productService.getAllProduct();
        // Using enhance for loop to print all product
        for(Product p : allProducts){
            System.out.println(p);
        }

        System.out.println("__________________________________________________________________________");
        // Getting product with particular name
        Product particularProductName = productService.getProductByName("Samsung M31");
        System.out.println(particularProductName);

        System.out.println("__________________________________________________________________________");
        // Getting product with particular place
        List<Product> productByPlace = productService.getProductByPlace("Desk1");
        for(Product p : productByPlace){
            System.out.println(p);
        }

        System.out.println("__________________________________________________________________________");
        // Getting product with particular type
        List<Product> productByType = productService.getProductByType("KeyBoard");
        for(Product p : productByType){
            System.out.println(p);
        }

        System.out.println("__________________________________________________________________________");
        // Getting product with expired warranty
        List<Product> productByExpiredWarranty = productService.getProductByExpiredWarranty();
        for(Product p : productByExpiredWarranty){
            System.out.println(p);
        }

        System.out.println("__________________________________________________________________________");
        // Getting product with a particular text
        List<Product> productByText= productService.getProductByText("PhOnE");
        for(Product p : productByText){
            System.out.println(p);
        }
    }
}