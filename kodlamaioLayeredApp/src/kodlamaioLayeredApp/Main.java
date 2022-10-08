package kodlamaioLayeredApp;

import kodlamaioLayeredApp.business.CategoryManager;
import kodlamaioLayeredApp.business.CourseManager;
import kodlamaioLayeredApp.business.InstructorManager;
import kodlamaioLayeredApp.core.logging.DatabaseLogger;
import kodlamaioLayeredApp.core.logging.FileLogger;
import kodlamaioLayeredApp.core.logging.IBaseLogger;
import kodlamaioLayeredApp.dataAccess.HibernateDao;
import kodlamaioLayeredApp.dataAccess.jdbcDao;
import kodlamaioLayeredApp.entities.Categories;
import kodlamaioLayeredApp.entities.Courses;
import kodlamaioLayeredApp.entities.Instructors;

public class Main {

	public static void main(String[] args) throws Exception {
		IBaseLogger[] logger = {new FileLogger(), new DatabaseLogger()};
		Courses course = new Courses(1, "JavaProgramming", 10);
		CourseManager courseManager = new CourseManager(new jdbcDao(),logger);
		courseManager.add(course);
		
		Categories category = new Categories(2, "Programming");
		CategoryManager categoryManager = new CategoryManager(new HibernateDao(),logger);
		categoryManager.add(category);
		
		Instructors instructor = new Instructors(3, "Duhan","Gökce");
		InstructorManager instructorManager = new InstructorManager(new jdbcDao(), logger);
		instructorManager.add(instructor);
		
		
		

	}

}
