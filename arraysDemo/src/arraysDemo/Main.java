package arraysDemo;

public class Main {

	public static void main(String[] args) {
		String student1 = "Engin";
		String student2 = "Duhan";
		String student3 = "Sule";
		
		String[] students = new String [3];
		students[0] = "Engin";
		students[1] = "Duhan";
		students[2] = "Sule";
		for (int i = 0; i < students.length; i++ ) {
			System.out.println(students[i]);
		}
		for(String student: students){
			
			System.out.println(student);
			
		}
		
				

	}

}
