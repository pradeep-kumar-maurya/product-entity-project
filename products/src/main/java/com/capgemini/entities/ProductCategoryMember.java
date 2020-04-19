package com.capgemini.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product_category_member")
public class ProductCategoryMember {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int productid;
	private int product_category_id;
	private String from_date;
	private String thru_date;
	@Override
	public String toString() {
		return "ProductCategoryMember [productid=" + productid + ", product_category_id=" + product_category_id
				+ ", from_date=" + from_date + ", thru_date=" + thru_date + ", comments=" + comments + ", sequence_num="
				+ sequence_num + ", quantity=" + quantity + "]";
	}
	private String comments;
	private int sequence_num;
	private int quantity;
	
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public int getProduct_category_id() {
		return product_category_id;
	}
	public void setProduct_category_id(int product_category_id) {
		this.product_category_id = product_category_id;
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
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public int getSequence_num() {
		return sequence_num;
	}
	public void setSequence_num(int sequence_num) {
		this.sequence_num = sequence_num;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}