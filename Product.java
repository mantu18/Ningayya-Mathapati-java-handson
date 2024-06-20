package com.mantu;

import java.util.Date;

public class Product implements Comparable<Product>{
		private int id;
		private String pname;
		private double price;
		private int quantity;
		private String description;
		private Date ordDate;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getPname() {
			return pname;
		}
		public void setPname(String pname) {
			this.pname = pname;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public Date getOrdDate() {
			return ordDate;
		}
		public void setOrdDate(Date ordDate) {
			this.ordDate = ordDate;
		}
		public Product(int id, String pname, double price, int quantity, String description, Date ordDate) {
			super();
			this.id = id;
			this.pname = pname;
			this.price = price;
			this.quantity = quantity;
			this.description = description;
			this.ordDate = ordDate;
		}
		@Override
		public String toString() {
			return "Product [id=" + id + ", pname=" + pname + ", price=" + price + ", quantity=" + quantity
					+ ", description=" + description + ", ordDate=" + ordDate + "]";
		}
		@Override
		public int compareTo(Product pro) {
			// TODO Auto-generated method stub
			if(this.price > pro.price) {
				return -1;
			}
			else if(this.price<pro.price) {
				return 1;
			}
			return 0;
		}
	}

