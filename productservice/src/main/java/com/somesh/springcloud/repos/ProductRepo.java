package com.somesh.springcloud.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.somesh.springcloud.model.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {

}
