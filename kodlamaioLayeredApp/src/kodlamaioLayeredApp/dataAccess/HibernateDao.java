package kodlamaioLayeredApp.dataAccess;

import kodlamaioLayeredApp.entities.Categories;
import kodlamaioLayeredApp.entities.Courses;
import kodlamaioLayeredApp.entities.Instructors;

public class HibernateDao implements IBaseDao {

	@Override
	public void add(Instructors instructor) {
		System.out.println(instructor.getFirstName()+instructor.getLastName() + " instructor added with Hibernate");
		
	}

	@Override
	public void add(Courses course) {
		System.out.println(course.getCourseName() + " course added with Hibernate");
		
	}
	public void add(Categories category) {
		System.out.println(category.getName() + " category added with Hibernate");
		
	}
	

}
