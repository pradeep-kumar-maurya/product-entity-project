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

import com.capgemini.entities.ProductStoreCatalog;
import com.capgemini.service.ProductStoreServiceI;

@RestController
@RequestMapping("/product-store")
public class ProductStoreCatalogController {
	
	@Autowired
	private ProductStoreServiceI service;
	
	@GetMapping("/get-product-store/{id}")
	public Optional<ProductStoreCatalog> getProductStore(@PathVariable("id") int id) {
		return service.getProductStore(id);
	}
	
	@PostMapping("/add-product-store")
	public String addProductStore(@RequestBody ProductStoreCatalog psc) {
		String string = service.addProductStore(psc);
		return string;
	}
	
	@PutMapping("/update-product-store")
	public String updateProductStore(@RequestBody ProductStoreCatalog psc) {
		String string = service.updateProductStore(psc);
		return string;
	}
	
	@DeleteMapping("/delete-product-store/{id}")
	public String deleteProductStore(@PathVariable("id") int id) {
		String string = service.deleteProductStore(id);
		return string;
	}
	
	@GetMapping("/fetch-all-product-stores")
	public List<ProductStoreCatalog> fetchAllProductStores(){
		List<ProductStoreCatalog> list = service.fetchAllProductStores();
		return list;
}
}
