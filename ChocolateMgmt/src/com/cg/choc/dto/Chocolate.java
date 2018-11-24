package com.cg.choc.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Chocolate 
{
	@Id
	@Column(name="choc_id")
	private int chocId;
	
	@Column(name="choc_name")
	@NotEmpty(message="Enter chocolate name")
	private String chocName;
	
	@Column(name="choc_price")
	@NotNull(message="Enter chocolate price")
	private double chocPrice;
	
	@Column(name="choc_qty")
	@NotNull(message="Enter chocolate quantity")
	private int chocQty;
	
	public Chocolate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Chocolate(String chocName, int chocId, double chocPrice, int chocQty) {
		super();
		this.chocName = chocName;
		this.chocId = chocId;
		this.chocPrice = chocPrice;
		this.chocQty = chocQty;
	}
	@Override
	public String toString() {
		return "Chocolate [chocName=" + chocName + ", chocId=" + chocId
				+ ", chocPrice=" + chocPrice + ", chocQty=" + chocQty + "]";
	}
	public String getChocName() {
		return chocName;
	}
	public void setChocName(String chocName) {
		this.chocName = chocName;
	}
	public int getChocId() {
		return chocId;
	}
	public void setChocId(int chocId) {
		this.chocId = chocId;
	}
	public double getChocPrice() {
		return chocPrice;
	}
	public void setChocPrice(double chocPrice) {
		this.chocPrice = chocPrice;
	}
	public int getChocQty() {
		return chocQty;
	}
	public void setChocQty(int chocQty) {
		this.chocQty = chocQty;
	}
	
}
