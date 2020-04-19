package com.capgemini.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ProductStoreCatalog")
public class ProductStoreCatalog {

	@Id
	@GeneratedValue
	private int product_store_id;
	private int prod_catalog_id;
	private String from_date;
	private String thru_date;
	private int sequence_num;
	public int getProduct_store_id() {
		return product_store_id;
	}
	public void setProduct_store_id(int product_store_id) {
		this.product_store_id = product_store_id;
	}
	public int getProd_catalog_id() {
		return prod_catalog_id;
	}
	public void setProd_catalog_id(int prod_catalog_id) {
		this.prod_catalog_id = prod_catalog_id;
	}
	public String getFrom_date() {
		return from_date;
	}
	public void setFrom_date(String from_date) {
		this.from_date = from_date;
	}
	public String getThru_date() {
		return thru_date;
	}
	public void setThru_date(String thru_date) {
		this.thru_date = thru_date;
	}
	public int getSequence_num() {
		return sequence_num;
	}
	public void setSequence_num(int sequence_num) {
		this.sequence_num = sequence_num;
	}
}