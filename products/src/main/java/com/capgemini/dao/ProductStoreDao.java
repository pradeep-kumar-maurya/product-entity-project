package com.capgemini.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.entities.ProductStoreCatalog;

public interface ProductStoreDao extends JpaRepository<ProductStoreCatalog, Integer>{

}
