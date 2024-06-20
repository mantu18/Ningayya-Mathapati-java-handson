package com.mantu.dao;

import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;


import com.mantu.Product;

public class ProductDaoImpl implements ProductDao {
	
	private static Map<Integer,Product> prDb=new HashMap<>();
	
	public ProductDaoImpl() {
		prDb.put(1,new Product(1,"bat",4000,3,"nike bat",new GregorianCalendar(2024,01,10).getTime()));
		prDb.put(2,new Product(2,"ball",400,20,"tennis",new GregorianCalendar(2024,03,13).getTime()));
	}
	

	@Override
	public Collection<Product> getAll() {
		// TODO Auto-generated method stub
		return prDb.values();
	}

	@Override
	public Product getById(int id) {
		// TODO Auto-generated method stub
		Product pr=prDb.get(id);
		if(pr==null) {
			System.out.println("product "+id +"doesnot exist");
		}
		return pr;
	}

	@Override
	public String addProduct(Product product) {
		// TODO Auto-generated method stub
		prDb.put(product.getId(), product);
		
		return "product "+product.getId()+"added successfully";
	}

	@Override
	public String updateProduct(Product product) {
		// TODO Auto-generated method stub
		Product pro=prDb.get(product.getId());
		pro.setPname(product.getPname());
		pro.setPrice(product.getPrice());
		pro.setQuantity(product.getQuantity());
		pro.setDescription(product.getDescription());
		pro.setOrdDate(product.getOrdDate());
		return "product "+product.getId()+"upload successfully";
	}

	@Override
	public String deleteProduct(int id) {
		// TODO Auto-generated method stub
		prDb.remove(id);
		return "product "+id +"deleted";
	}

}
