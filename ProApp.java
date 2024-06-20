package com.mantu.dao;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.mantu.Product;
import com.mantu.exceptions.ProductNotFoundException;
import com.mantu.service.ProService;
import com.mantu.service.ProductServiceImpl;


public class ProApp {
	private static Scanner sc=new Scanner(System.in);
	private static ProService prService=new ProductServiceImpl();
	public static void main(String[] args) {
		int choice=0;
		while(true) {
			System.out.println("1.show all Products");
			System.out.println("2.find product id");
			System.out.println("3.add the product");
			System.out.println("4.update the product");
			System.out.println("5.delete the product");
			System.out.println("6.exit");
			choice =sc.nextInt();
			switch(choice) {
			case 1:
				var products=prService.getAll();
				for (Product product : products) {
					System.out.println(product);
				}
				break;
			case 2:
				try {
					System.out.println("enter product id");
					int id =sc.nextInt();
					var product=prService.getById(id);
					System.out.println(product);
					System.out.println();
				}
				catch(ProductNotFoundException ex){
					System.out.println(ex.getMessage());
				}
				break;
			case 3:
				addProduct();
				
				break;
			case 4:
				updateProduct();
				break;
			case 5:
				deleteProduct();
				break;
			case 6:
				System.out.println();
				break;
			default:
				System.out.println("invalid choice");
				
			}
		}
	}
	private static void deleteProduct() {
		// TODO Auto-generated method stub
		System.out.println("enter product id");
		int id=sc.nextInt();
		String result=prService.deleteProduct(id);
		System.out.println(result);
		System.out.println();
		
		
		
	}
	private static void updateProduct() {
		// TODO Auto-generated method stub
		Product product=new Product(0, null, 0, 0, null, null);
		System.out.println("Enter product Id");
		product.setId(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter product Name");
		product.setPname(sc.nextLine());
		System.out.println("enter price");
		product.setPrice(sc.nextDouble());
		System.out.println("enter quantity");
		product.setQuantity(sc.nextInt());
		sc.nextLine();
		System.out.println("enter description");
		product.setDescription(sc.nextLine());
		System.out.println("enter date");
//		String d=sc.nextLine();
		String result=prService.updateProduct(product);
		System.out.println(result);
		
	}
	private static void addProduct() {
		// TODO Auto-generated method stub
		Product product=new Product(0, null, 0, 0, null, null);
		System.out.println("Enter product Id");
		product.setId(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter product Name");
		product.setPname(sc.nextLine());
		System.out.println("enter price");
		product.setPrice(sc.nextDouble());
		System.out.println("enter quantity");
		product.setQuantity(sc.nextInt());
		sc.nextLine();
		System.out.println("enter description");
		product.setDescription(sc.nextLine());
		System.out.println("enter date");
//		String d=sc.nextLine();
//		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
//		Date date=sdf.parse(d);
		
		
		
		String result=prService.addProduct(product);
		System.out.println(result);
		
		System.out.println();
		
		
	}
	
}
