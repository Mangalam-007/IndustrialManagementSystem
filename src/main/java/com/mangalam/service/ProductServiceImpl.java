package com.mangalam.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mangalam.model.Product;
import com.mangalam.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{

    private ProductRepository productRepo;
    @Override
    public Product saveProduct(Product product) {
        return productRepo.save(product);
    }

    @Override
    public String deleteProduct(Integer id) {
        Product product = productRepo.findById(id).get();
        if(product!=null){
            productRepo.delete(product);
            return "Product Delete";
        }
        return "Something wrong on server";
    }

    @Override
    public List<Product> getAllProduct() {
        return productRepo.findAll();
    }

    @Override
    public Product getProductById(Integer id) {
        return productRepo.findById(id).get();
    }

}
