package oopWithNlayeredApp;

import java.io.File;

import oopWithNlayeredApp.business.ProductManager;
import oopWithNlayeredApp.core.logging.DatabaseLogger;
import oopWithNlayeredApp.core.logging.FileLogger;
import oopWithNlayeredApp.core.logging.Logger;
import oopWithNlayeredApp.dataAccess.HibernateProductDao;
import oopWithNlayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		Product product1 = new Product(1,"iPhone 13", 28000 );
		Logger[] loggers = {new DatabaseLogger(), new FileLogger()};
		ProductManager productManager = new ProductManager(new  HibernateProductDao(), loggers);
		productManager.add(product1);
		
	}

}
