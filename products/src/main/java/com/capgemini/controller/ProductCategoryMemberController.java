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

import com.capgemini.entities.ProductCategoryMember;
import com.capgemini.service.ProductCategoryServiceI;

@RestController
@RequestMapping("/Product-Category")
public class ProductCategoryMemberController {
	
	@Autowired
	private ProductCategoryServiceI service;
	
	@GetMapping("/getDetails/{id}")
	public Optional<ProductCategoryMember> getDetails(@PathVariable int id) {
		return service.getDetails(id);
	}
	
	@PostMapping("/add-product-category")
	public String addProductCategory(@RequestBody ProductCategoryMember pcm) {
		String string = service.addProductCategory(pcm);
		return string;
	}
	
	@PutMapping("/update-product-category")
	public String updateProductCategory(@RequestBody ProductCategoryMember pcm) {
		String string = service.updateProductCategory(pcm);
		return string;
	}
	
	@DeleteMapping("/delete-product-category/{id}")
	public String deleteProductCategory(@PathVariable("id") int id) {
		String string = service.deleteProductCategory(id);
		return string;
	}
	
	@GetMapping("/fetch-all-product-category")
	public List<ProductCategoryMember> fetchAllProductCategory(){
		List<ProductCategoryMember> list = service.fetchAllProductCategory();
		return list;
	}
}
