package pxu.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import pxu.com.model.Product;
import pxu.com.repository.ProductRepository;

public class ProductServiceImpl implements ProductService {
	@Autowired
	public ProductRepository productRespository;

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Product product) {
		// TODO Auto-generated method stub

	}

}
