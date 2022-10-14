package oopWithNlayeredApp.dataAccess;

import oopWithNlayeredApp.entities.Product;

public class jdbcProductDao implements ProductDao {
	public void add(Product product) {
		System.out.println("added to database with JDBC");
	}
}
