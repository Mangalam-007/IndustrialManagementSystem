package com.mangalam.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mangalam.model.Product;

public interface ProductService {
    public Product saveProduct(Product product);
    public List<Product> getAllProduct();
    public Product getProductById(Integer id);
    public String deleteProduct(Integer id);


}
