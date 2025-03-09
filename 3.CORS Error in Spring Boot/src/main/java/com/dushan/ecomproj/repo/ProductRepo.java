package com.dushan.ecomproj.repo;

import com.dushan.ecomproj.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Integer> {
}
