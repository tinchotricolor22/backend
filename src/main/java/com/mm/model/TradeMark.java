package com.mm.model;

public class TradeMark extends Entity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String description;
	
	public TradeMark() { }
	
	public TradeMark(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
