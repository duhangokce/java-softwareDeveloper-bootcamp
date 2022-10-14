package oopWithNlayeredApp.business;

import java.util.List;

import oopWithNlayeredApp.core.logging.Logger;
import oopWithNlayeredApp.dataAccess.ProductDao;
import oopWithNlayeredApp.entities.Product;

public class ProductManager {
	
	private ProductDao productDao;
	private Logger[]loggers;
	
	
	public ProductManager(ProductDao productDao, Logger[] loggers) {
		this.loggers = loggers;
		this.productDao = productDao;
	}


	public void add(Product product) throws Exception {
		if(product.getUnitPrice()<10) {
			throw new Exception("invalid price");
		}
		
		productDao.add(product);
		for(Logger logger: loggers) {
			logger.log(product.getName());
		}
		
	}
}
