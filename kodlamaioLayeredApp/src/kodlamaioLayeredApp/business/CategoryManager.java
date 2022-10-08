package kodlamaioLayeredApp.business;

import kodlamaioLayeredApp.core.logging.IBaseLogger;
import kodlamaioLayeredApp.dataAccess.IBaseDao;
import kodlamaioLayeredApp.entities.Categories;

public class CategoryManager {
	private IBaseDao databaseManager;
	private IBaseLogger[] logger;
	private Categories[] categories= {};
	
	
	public CategoryManager(IBaseDao databaseManager, IBaseLogger[] logger) {
		super();
		this.databaseManager = databaseManager;
		this.logger = logger;
	}


	public CategoryManager(IBaseDao databaseManager, IBaseLogger[] logger, Categories[] categories) {
		super();
		this.databaseManager = databaseManager;
		this.logger = logger;
		this.categories = categories;
	}


	public CategoryManager(IBaseDao databaseManager, Categories[] categories) {
		super();
		this.databaseManager = databaseManager;
		this.categories = categories;
	}


	public CategoryManager(IBaseDao databaseManager) {
		super();
		this.databaseManager = databaseManager;
	}


	public void add(Categories category) throws Exception {
		for(Categories cat:categories) {
			if(category.getName() == cat.getName()) {
				throw new Exception("category name exists");
		 }
				
		}
		databaseManager.add(category);
		for(IBaseLogger logger: logger) {
			logger.log(category.getName());
		}
	}

}
