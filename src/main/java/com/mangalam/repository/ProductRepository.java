package com.mangalam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mangalam.model.Product;

public interface ProductRepository extends JpaRepository <Product, Integer> {

}
