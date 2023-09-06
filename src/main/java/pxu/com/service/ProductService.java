package pxu.com.service;

import java.util.List;

import pxu.com.model.Product;

public interface ProductService {
	List<Product> findAll();

	Product findById(int id);

	void save(Product product);
}
