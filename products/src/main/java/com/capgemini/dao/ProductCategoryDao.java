package com.capgemini.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.entities.ProductCategoryMember;

public interface ProductCategoryDao extends JpaRepository<ProductCategoryMember, Integer>{

}
