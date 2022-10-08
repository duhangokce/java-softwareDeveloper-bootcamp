package kodlamaioLayeredApp.dataAccess;

import kodlamaioLayeredApp.entities.Categories;
import kodlamaioLayeredApp.entities.Courses;
import kodlamaioLayeredApp.entities.Instructors;

public class jdbcDao implements IBaseDao {
	public void add(Instructors instructor) {
		System.out.println(instructor.getFirstName()+instructor.getLastName() + " instructor added with JDBC");
		
	}

	
	public void add(Courses course) {
		System.out.println(course.getCourseName() + " course added with JDBC");
		
	}
	public void add(Categories category) {
		System.out.println(category.getName() + " category added with JDBC");
	}

}
