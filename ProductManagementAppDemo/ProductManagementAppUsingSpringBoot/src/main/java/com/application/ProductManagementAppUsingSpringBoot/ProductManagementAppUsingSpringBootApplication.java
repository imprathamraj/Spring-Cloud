package com.application.ProductManagementAppUsingSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class ProductManagementAppUsingSpringBootApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ProductManagementAppUsingSpringBootApplication.class, args);

		System.out.println("--- WELCOME TO PRODUCT MANAGEMENT APPLICATION ---");
		// No need -> ProductService productService = new ProductService();
		// Create the container where objects are already created <- Dependency injection
		ProductService productService = context.getBean(ProductService.class);


		System.out.println("__________________________________________________________________________");
		// Getting all products
		List<Product> allProducts = productService.getAllProduct();
		// Using enhance for loop to print all product
		for(Product p : allProducts){
			System.out.println(p);
		}
//
//		System.out.println("__________________________________________________________________________");
//		// Getting product with particular name
//		Product particularProductName = productService.getProductByName("Samsung M31");
//		System.out.println(particularProductName);
//
//		System.out.println("__________________________________________________________________________");
//		// Getting product with particular place
//		List<Product> productByPlace = productService.getProductByPlace("Desk1");
//		for(Product p : productByPlace){
//			System.out.println(p);
//		}
//
//		System.out.println("__________________________________________________________________________");
//		// Getting product with particular type
//		List<Product> productByType = productService.getProductByType("KeyBoard");
//		for(Product p : productByType){
//			System.out.println(p);
//		}
//
//		System.out.println("__________________________________________________________________________");
//		// Getting product with expired warranty
//		List<Product> productByExpiredWarranty = productService.getProductByExpiredWarranty();
//		for(Product p : productByExpiredWarranty){
//			System.out.println(p);
//		}
//
//		System.out.println("__________________________________________________________________________");
//		// Getting product with a particular text
//		List<Product> productByText= productService.getProductByText("PhOnE");
//		for(Product p : productByText){
//			System.out.println(p);
//		}
	}

}
