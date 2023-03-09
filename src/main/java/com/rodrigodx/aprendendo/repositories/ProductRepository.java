package com.rodrigodx.aprendendo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigodx.aprendendo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
