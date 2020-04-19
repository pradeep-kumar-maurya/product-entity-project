package com.capgemini.service;

import java.util.List;
import java.util.Optional;

import com.capgemini.entities.ProductCategoryMember;

public interface ProductCategoryServiceI {

	String addProductCategory(ProductCategoryMember pcm);

	Optional<ProductCategoryMember> getDetails(int id);

	String updateProductCategory(ProductCategoryMember pcm);

	String deleteProductCategory(int id);

	List<ProductCategoryMember> fetchAllProductCategory();

}
