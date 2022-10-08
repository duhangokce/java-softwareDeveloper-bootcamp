package kodlamaioLayeredApp.business;

import kodlamaioLayeredApp.core.logging.IBaseLogger;
import kodlamaioLayeredApp.dataAccess.IBaseDao;
import kodlamaioLayeredApp.entities.Instructors;

public class InstructorManager {
	private IBaseDao databaseManager;
	private IBaseLogger[] logger;
	
	
	
	public InstructorManager(IBaseDao databaseManager, IBaseLogger[] logger) {
		super();
		this.databaseManager = databaseManager;
		this.logger = logger;
	}



	public void add(Instructors instructor) {
		
		databaseManager.add(instructor);
		for(IBaseLogger logger: logger) {
			logger.log(instructor.getFirstName());
		}
		
	}

}
