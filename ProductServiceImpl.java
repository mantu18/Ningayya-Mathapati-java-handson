package com.mantu.service;

import java.util.Collection;

import com.mantu.Product;
import com.mantu.dao.ProductDao;
import com.mantu.dao.ProductDaoImpl;

public class ProductServiceImpl implements ProService {
	private ProductDao productDao=new ProductDaoImpl();

	@Override
	public Collection<Product> getAll() {
		// TODO Auto-generated method stub
		
		return productDao.getAll();
	}

	@Override
	public Product getById(int id) {
		// TODO Auto-generated method stub
		return productDao.getById(id);
	}

	@Override
	public String addProduct(Product product) {
		// TODO Auto-generated method stub
		return productDao.addProduct(product);
	}

	@Override
	public String updateProduct(Product product) {
		// TODO Auto-generated method stub
		return productDao.updateProduct(product);
	}

	@Override
	public String deleteProduct(int id) {
		// TODO Auto-generated method stub
		return productDao.deleteProduct(id);
	}
}
