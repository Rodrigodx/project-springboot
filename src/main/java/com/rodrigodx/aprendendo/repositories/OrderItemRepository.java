package com.rodrigodx.aprendendo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigodx.aprendendo.entities.OrderItem;
import com.rodrigodx.aprendendo.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
