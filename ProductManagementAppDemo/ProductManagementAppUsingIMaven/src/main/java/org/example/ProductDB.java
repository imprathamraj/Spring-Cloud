package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDB {

    Connection connection = null;

    public ProductDB(){
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ProductManagement","postgres","1234");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void save(Product product) {
        String query = "insert into product (name, type, place, warranty) values (?,?,?,?)";
        try {
            PreparedStatement st = connection.prepareStatement(query);

            st.setString(1, product.getName());
            st.setString(2, product.getType());
            st.setString(3, product.getPlace());
            st.setInt(4,product.getWarranty());

            st.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public List<Product> getAll(){
        List<Product> products = new ArrayList<>();
        String query = "select name, type, place, warranty from product";
        try {
            PreparedStatement st = connection.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setName(rs.getString(1));
                p.setType(rs.getString(2));
                p.setPlace(rs.getString(3));
                p.setWarranty(rs.getInt(4));
                products.add(p);
            }
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return products;
    }
    // Retrieve product by name
    public Product getProductByName(String name) {
        String query = "SELECT name, type, place, warranty FROM product WHERE name = ?";
        try (PreparedStatement st = connection.prepareStatement(query)) {
            st.setString(1, name);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Product p = new Product();
                p.setName(rs.getString("name"));
                p.setType(rs.getString("type"));
                p.setPlace(rs.getString("place"));
                p.setWarranty(rs.getInt("warranty"));
                return p;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    // Retrieve products by place
    public List<Product> getProductByPlace(String place) {
        List<Product> products = new ArrayList<>();
        String query = "SELECT name, type, place, warranty FROM product WHERE place = ?";
        try (PreparedStatement st = connection.prepareStatement(query)) {
            st.setString(1, place);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setName(rs.getString("name"));
                p.setType(rs.getString("type"));
                p.setPlace(rs.getString("place"));
                p.setWarranty(rs.getInt("warranty"));
                products.add(p);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return products;
    }

    // Retrieve products by type
    public List<Product> getProductByType(String type) {
        List<Product> products = new ArrayList<>();
        String query = "SELECT name, type, place, warranty FROM product WHERE type = ?";
        try (PreparedStatement st = connection.prepareStatement(query)) {
            st.setString(1, type);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setName(rs.getString("name"));
                p.setType(rs.getString("type"));
                p.setPlace(rs.getString("place"));
                p.setWarranty(rs.getInt("warranty"));
                products.add(p);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return products;
    }

    // Retrieve products with expired warranty
    public List<Product> getProductByExpiredWarranty() {
        List<Product> products = new ArrayList<>();
        String query = "SELECT name, type, place, warranty FROM product WHERE warranty < 2025";
        try (PreparedStatement st = connection.prepareStatement(query);
             ResultSet rs = st.executeQuery()) {
            while (rs.next()) {
                Product p = new Product();
                p.setName(rs.getString("name"));
                p.setType(rs.getString("type"));
                p.setPlace(rs.getString("place"));
                p.setWarranty(rs.getInt("warranty"));
                products.add(p);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return products;
    }

    // Retrieve products that match a text search
    public List<Product> getProductByText(String text) {
        List<Product> products = new ArrayList<>();
        String query = "SELECT name, type, place, warranty FROM product WHERE LOWER(name) LIKE ? OR LOWER(type) LIKE ? OR LOWER(place) LIKE ?";
        try (PreparedStatement st = connection.prepareStatement(query)) {
            String searchText = "%" + text.toLowerCase() + "%";
            st.setString(1, searchText);
            st.setString(2, searchText);
            st.setString(3, searchText);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setName(rs.getString("name"));
                p.setType(rs.getString("type"));
                p.setPlace(rs.getString("place"));
                p.setWarranty(rs.getInt("warranty"));
                products.add(p);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return products;
    }
}
