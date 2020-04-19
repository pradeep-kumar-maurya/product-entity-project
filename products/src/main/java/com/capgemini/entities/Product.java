package com.capgemini.entities;

import javax.persistence.CascadeType;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int product_id;
	private int product_type_id;
	private int primary_product_category_id;
	private int manufacture_party_id;
	private int facility_id;
	private String product_name;
	private int config_id;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="productid")
	private ProductCategoryMember pcm;
		
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public int getProduct_type_id() {
		return product_type_id;
	}
	public void setProduct_type_id(int product_type_id) {
		this.product_type_id = product_type_id;
	}
	public int getPrimary_product_category_id() {
		return primary_product_category_id;
	}
	public void setPrimary_product_category_id(int primary_product_category_id) {
		this.primary_product_category_id = primary_product_category_id;
	}
	public int getManufacture_party_id() {
		return manufacture_party_id;
	}
	public void setManufacture_party_id(int manufacture_party_id) {
		this.manufacture_party_id = manufacture_party_id;
	}
	public int getFacility_id() {
		return facility_id;
	}
	public void setFacility_id(int facility_id) {
		this.facility_id = facility_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public int getConfig_id() {
		return config_id;
	}
	public void setConfig_id(int config_id) {
		this.config_id = config_id;
	}
}