package com.capgemini.service;

import java.util.List;
import java.util.Optional;

import com.capgemini.entities.Product;

public interface ProductServiceI {

	Optional<Product> getProductDetails(int id);

	String addproduct(Product pro);

	String updateProducts(Product pro);

	String deleteProduct(int id);

	List<Product> fetchAllProducts();
	
}
