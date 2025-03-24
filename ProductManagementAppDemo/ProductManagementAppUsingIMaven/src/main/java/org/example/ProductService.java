package org.example;

import java.util.ArrayList;
import java.util.List;

public class ProductService {

    List<Product> products = new ArrayList<>();
    ProductDB productDB = new ProductDB();
    // Adding product
    public void addProduct(Product product) {
        products.add(product);
        productDB.save(product);
    }

    // Getting all product
    public List<Product> getAllProduct() {
        return productDB.getAll();
    }

    // Getting product with a particular name
    public Product getProductByName(String name){
        return productDB.getProductByName(name);
    }

    // Getting product with a particular place
    public List<Product> getProductByPlace(String place){
        return productDB.getProductByPlace(place);
    }

    // Getting product with a particular type
    public List<Product> getProductByType(String type){
        return productDB.getProductByType(type);
    }

    // Getting product with expired warranty
    public List<Product> getProductByExpiredWarranty() {
        return productDB.getProductByExpiredWarranty();
    }

    // Getting product with particular text
    public List<Product> getProductByText(String text) {
        return productDB.getProductByText(text);
    }
}
