package com.mm.model;

public class Product extends Entity {

	private static final long serialVersionUID = 1L;
	private String code;
	private String description;
	private ProductType type;
	private TradeMark trademark;
	
	public Product() { }
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}

	public ProductType getType() {
		return type;
	}

	public void setType(ProductType type) {
		this.type = type;
	}

	public TradeMark getTrademark() {
		return trademark;
	}

	public void setTrademark(TradeMark trademark) {
		this.trademark = trademark;
	}
}
