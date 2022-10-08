package kodlamaioLayeredApp.dataAccess;

import kodlamaioLayeredApp.entities.Categories;
import kodlamaioLayeredApp.entities.Courses;
import kodlamaioLayeredApp.entities.Instructors;

public interface IBaseDao {
	void add(Instructors instructor);
	void add(Courses course);
	void add(Categories category);
	
	

}
