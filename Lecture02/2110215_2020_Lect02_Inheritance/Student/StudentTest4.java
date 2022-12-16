package Student;

import java.util.ArrayList;

public class StudentTest4 {
	public static void main(String[] args) {
		/*Student s;
		GraduateStudent g = new GraduateStudent("Nat");
		UndergraduateStudent u = new UndergraduateStudent("Toey");		
		s = g;
		s.printName();		
		s = u;
		s.printName(); // polymorphism
		*/
		Student[] students = new Student[3];
		students[0] = new UndergraduateStudent("A");
		students[1] = new UndergraduateStudent("B");
		students[2] = new GraduateStudent("C");
		
		for(Student s : students) {
			s.printName(); //polymorphism
		}
		
	}
}
