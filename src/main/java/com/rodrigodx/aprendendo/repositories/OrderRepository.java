package com.rodrigodx.aprendendo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigodx.aprendendo.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
