package com.capgemini.service;

import java.util.List;
import java.util.Optional;

import com.capgemini.entities.ProductStoreCatalog;

public interface ProductStoreServiceI {

	String addProductStore(ProductStoreCatalog psc);

	Optional<ProductStoreCatalog> getProductStore(int id);

	String updateProductStore(ProductStoreCatalog psc);

	String deleteProductStore(int id);

	List<ProductStoreCatalog> fetchAllProductStores();

}
