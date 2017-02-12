package com.mm.model;

public class ProductType extends Entity {

	private static final long serialVersionUID = -2456253918188565568L;
	private String description;
	
	public ProductType() { }
	
	public ProductType(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
