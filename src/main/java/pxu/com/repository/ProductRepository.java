package pxu.com.repository;

import java.util.List;

import pxu.com.model.Product;

public interface ProductRepository {
	List<Product> findAll();

	Product findById(int id);

	void save(Product product);
}
