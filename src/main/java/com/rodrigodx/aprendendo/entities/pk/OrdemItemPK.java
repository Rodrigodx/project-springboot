package com.rodrigodx.aprendendo.entities.pk;

import java.io.Serializable;
import java.util.Objects;

import com.rodrigodx.aprendendo.entities.Order;
import com.rodrigodx.aprendendo.entities.Product;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Embeddable
public class OrdemItemPK implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name = "order_id")
	private Product product;
	
	@ManyToOne
	@JoinColumn(name = "product_id")
	private Order order;
	
	
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(order, product);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrdemItemPK other = (OrdemItemPK) obj;
		return Objects.equals(order, other.order) && Objects.equals(product, other.product);
	}
	
	
	
	
}
