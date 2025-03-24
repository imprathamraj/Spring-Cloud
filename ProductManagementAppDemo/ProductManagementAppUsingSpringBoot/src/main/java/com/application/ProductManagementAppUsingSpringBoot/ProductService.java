package com.application.ProductManagementAppUsingSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductDB productDB;
//    // Adding product
//    List<Product> products = new ArrayList<>();
//    public void addProduct(Product product) {
//        products.add(product);
//        productDB.save(product);
//    }
//
    // Getting all product
    public List<Product> getAllProduct() {
        return productDB.findAll();
    }
//
//    // Getting product with a particular name
//    public Product getProductByName(String name){
//        return productDB.getProductByName(name);
//    }
//
//    // Getting product with a particular place
//    public List<Product> getProductByPlace(String place){
//        return productDB.getProductByPlace(place);
//    }
//
//    // Getting product with a particular type
//    public List<Product> getProductByType(String type){
//        return productDB.getProductByType(type);
//    }
//
//    // Getting product with expired warranty
//    public List<Product> getProductByExpiredWarranty() {
//        return productDB.getProductByExpiredWarranty();
//    }
//
//    // Getting product with particular text
//    public List<Product> getProductByText(String text) {
//        return productDB.getProductByText(text);
//    }
}
