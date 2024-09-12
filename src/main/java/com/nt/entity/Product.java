package com.nt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product", schema = "employee")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "stock")
	private int stock;
	
	@Column(name = "price")
	private int price;
	
	@Column(name = "state")
	private String state;

	public Product() {
		super();
	}

	

	public Product(int id, String name, int stock, int price, String state) {
		super();
		this.id = id;
		this.name = name;
		this.stock = stock;
		this.price = price;
		this.state = state;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}

}
