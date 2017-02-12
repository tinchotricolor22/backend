package com.mm.model;

public class ProductTypeCategory extends Entity {

	private static final long serialVersionUID = 1L;
	private ProductType type;
	private ProductType typeParent;
	
	public ProductTypeCategory() { }

	public ProductType getType() {
		return type;
	}

	public void setType(ProductType type) {
		this.type = type;
	}

	public ProductType getTypeParent() {
		return typeParent;
	}

	public void setTypeParent(ProductType typeParent) {
		this.typeParent = typeParent;
	}
}
