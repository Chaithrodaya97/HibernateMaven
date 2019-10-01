package com.zensar.hibernate.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * @author: Chaithrodaya B S
 * @creation date : 1-10-2019 10.05 AM
 * @modification date : 1-10-2019 10.05 AM
 * @description : Hibernate Product Class
*/

@Entity
@Table(name="production")
public class Product 
{
	@Id
	@Column(name = "id")
	private int productId;
	private String name;
	@Column(name = "branch")
	private String brand;
	private float price;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}
	
	
	
	
	
	
}
