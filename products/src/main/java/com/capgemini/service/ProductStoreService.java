package com.capgemini.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.dao.ProductStoreDao;
import com.capgemini.entities.ProductStoreCatalog;

@Service
@Transactional
public class ProductStoreService implements ProductStoreServiceI {
	
	@Autowired
	private ProductStoreDao dao;

	@Override
	public String addProductStore(ProductStoreCatalog psc) {
		boolean bool = dao.existsById(psc.getProduct_store_id());
		if(bool == true) {
			return "Product store with Id : "+psc.getProduct_store_id()+" already exist";
		}
		else {
			dao.save(psc);
			return "product store was added successfully!!";
		}
	}

	@Override
	public Optional<ProductStoreCatalog> getProductStore(int id) {
		return dao.findById(id);
	}

	@Override
	public String updateProductStore(ProductStoreCatalog psc) {
		boolean bool = dao.existsById(psc.getProduct_store_id());
		if(bool == true) {
			dao.save(psc);
			return "Product Store was updated successfully!!";
		}
		else {
			return "Product Store with ID : "+psc.getProduct_store_id()+" does not exist";
		}
	}

	@Override
	public String deleteProductStore(int id) {
		boolean bool = dao.existsById(id);
		if(bool == true) {
			dao.deleteById(id);
			return "Product Store with ID : "+id+" was successfully deleted!!";
		}
		else {
			return "Product Store with ID : "+id+" does not exist";
		}
	}

	@Override
	public List<ProductStoreCatalog> fetchAllProductStores() {
		List<ProductStoreCatalog> list = dao.findAll();
		return list;
	}
}
