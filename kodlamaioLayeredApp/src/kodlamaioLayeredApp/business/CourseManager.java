package kodlamaioLayeredApp.business;

import kodlamaioLayeredApp.core.logging.IBaseLogger;
import kodlamaioLayeredApp.dataAccess.IBaseDao;
import kodlamaioLayeredApp.entities.Courses;

public class CourseManager {
	private IBaseDao databaseManager;
	private IBaseLogger[] loggers;
	private Courses[] courses= {};
	
	
	
 public CourseManager(IBaseDao databaseManager, IBaseLogger[] loggers, Courses[] courses) {
		super();
		this.databaseManager = databaseManager;
		this.loggers = loggers;
		this.courses = courses;

	}
 public CourseManager(IBaseDao databaseManager, IBaseLogger[] loggers) {
		super();
		this.databaseManager = databaseManager;
		this.loggers = loggers;
 }
		



 public void add(Courses course) throws Exception {
		for(Courses course1: courses) {
			
			if(course.getCourseName() == course1.getCourseName())  {
				throw new Exception("Course name exists");
		
		}
			if(course.getCoursePrice() < 0 ) {
			throw new Exception("Course Price cannot be lower than 0");
		}
			
			
		}
		databaseManager.add(course);
		for(IBaseLogger logger: loggers) {
			logger.log(course.getCourseName());
		}
		
	}
	

}
