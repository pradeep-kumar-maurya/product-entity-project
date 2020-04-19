package com.capgemini.service;

import java.util.List;
import java.util.Optional;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.dao.ProductCategoryDao;
import com.capgemini.entities.ProductCategoryMember;

@Service
@Transactional
public class ProductCategoryService implements ProductCategoryServiceI{

	@Autowired
	private ProductCategoryDao dao;
	
	@Override
	public String addProductCategory(ProductCategoryMember pcm) {
		boolean bool = dao.existsById(pcm.getProductid());
		if(bool == false) {
			dao.save(pcm);
			return "poduct category added successfully!!";
		}
		else{
			return "product with ID : "+pcm.getProductid()+" already exist";
		}
	}

	@Override
	public Optional<ProductCategoryMember> getDetails(int id) {
		return dao.findById(id);
	}

	@Override
	public String updateProductCategory(ProductCategoryMember pcm) {
		boolean bool = dao.existsById(pcm.getProductid());
		if(bool == true) {
			dao.save(pcm);
			return "Poduct category was updated successfully!!";
		}
		else{
			return "Product with ID : "+pcm.getProductid()+" does not exist";
		}
	}

	@Override
	public String deleteProductCategory(int id) {
		boolean bool = dao.existsById(id);
		if(bool == true) {
			dao.deleteById(id);
			return "Product Category was deleted successfully!!";
		}
		else {
			return"Product Category with ID : "+id+" does not exist";
		}
	}

	@Override
	public List<ProductCategoryMember> fetchAllProductCategory() {
		List<ProductCategoryMember> list = dao.findAll();
		return list;
	}
}
