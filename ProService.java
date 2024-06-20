package com.mantu.service;
import java.util.Collection;

import com.mantu.Product;

public interface ProService {
	Collection<Product>getAll();
	Product getById(int id);
	String addProduct(Product product);
	String updateProduct(Product product);
	String deleteProduct(int id);
}
