package com.capgemini.service;

import java.util.List;
import java.util.Optional;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.dao.ProductDao;
import com.capgemini.entities.Product;

@Service
@Transactional
public class ProductService implements ProductServiceI{

	@Autowired
	private ProductDao dao;

	@Override
	public Optional<Product> getProductDetails(int id) {
		return dao.findById(id);
	}

	@Override
	public String addproduct(Product pro) {
		boolean bool = dao.existsById(pro.getProduct_id());
		if(bool == false) {
			dao.save(pro);
			return "product was added successfully";
		}
		else {
			return "Product with ID : "+pro.getProduct_id()+" already exists";
		}
	}

	@Override
	public String updateProducts(Product pro) {
		boolean bool = dao.existsById(pro.getProduct_id());
		if(bool == true) {
			dao.save(pro);
			return "Product details were updated successfully!!";
		}
		else {
			return "Product with Product ID : "+pro.getProduct_id()+" does not exist";
		}
	}

	@Override
	public String deleteProduct(int id) {
		boolean bool = dao.existsById(id);
		if(bool == true) {
			dao.deleteById(id);
			return "Product with ID : "+id+" was successfully deleted!!";
		}
		else {
			return "Product with ID : "+id+" does not exist";
		}
	}

	@Override
	public List<Product> fetchAllProducts() {
		List<Product> list = dao.findAll();
		return list;
	}
}
