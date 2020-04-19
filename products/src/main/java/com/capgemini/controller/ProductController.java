package com.capgemini.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.entities.Product;
import com.capgemini.service.ProductServiceI;

@RestController
@RequestMapping("/Product")
public class ProductController {

	@Autowired
	private ProductServiceI service;

	@PostMapping("/add-product")
	public String addProduct(@RequestBody Product pro) {
		String string = service.addproduct(pro);
		return string;
	}

	@GetMapping("/product-details/{product id}")
	public Optional<Product> productDetails(@PathVariable("product id") int id){
		Optional<Product> product = service.getProductDetails(id);
		return product;
	}

	@PutMapping("/udpate-product")
	public String updateProduct(@RequestBody Product pro) {
		String string = service.updateProducts(pro);
		return string;
	}

	@DeleteMapping("/delete-product/{id}")
	public String deleteProduct(@PathVariable("id") int id) {
		String string = service.deleteProduct(id);
		return string;
	}
	
	@GetMapping("/fetch-all-products")
	public List<Product> fetchAllProducts(){
		List<Product> list = service.fetchAllProducts();
		return list;
	}
}
