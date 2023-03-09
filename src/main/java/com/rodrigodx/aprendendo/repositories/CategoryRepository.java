package com.rodrigodx.aprendendo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigodx.aprendendo.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
