package pxu.com.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import pxu.com.model.Product;

public class ProductRepositoryImpl implements ProductRepository {
	private static final Map<Integer, Product> products;
	static {
		products = new HashMap<>();
		products.put(1, new Product(1, "GTPS", "ABCDS", 220));
		products.put(2, new Product(2, "ABCX", "ABCDS", 220));
		products.put(3, new Product(3, "BAC", "ABCDS", 220));
		products.put(4, new Product(4, "GTAS", "ABCDS", 220));
	}

	@Override
	public List<Product> findAll() {
		return new ArrayList<>(products.values());
	}

	@Override
	public Product findById(int id) {
		Product product = products.get(id);
		return null;
	}

	@Override
	public void save(Product product) {
		products.put(product.getId(), product);

	}

}
