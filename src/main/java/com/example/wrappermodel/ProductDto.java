package com.example.wrappermodel;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class ProductDto{
	
	
	/**
	 * 
	 */
	private String product_id;
	private String product_name;
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getMagnifacture_date() {
		return magnifacture_date;
	}
	public void setMagnifacture_date(String magnifacture_date) {
		this.magnifacture_date = magnifacture_date;
	}
	public String getExpiry_date() {
		return expiry_date;
	}
	public void setExpiry_date(String expiry_date) {
		this.expiry_date = expiry_date;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getBuy_date() {
		return buy_date;
	}
	public void setBuy_date(String buy_date) {
		this.buy_date = buy_date;
	}
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private String magnifacture_date;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private String expiry_date;
	private int quantity;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private String buy_date;
}
