
package com.example.testspringboot;

public class ProductDetails {

	String name;
	long id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "ProductDetails [name=" + name + ", id=" + id + "]";
	}

	public ProductDetails(String name, long id) {
		super();
		this.name = name;
		this.id = id;
	}

}
