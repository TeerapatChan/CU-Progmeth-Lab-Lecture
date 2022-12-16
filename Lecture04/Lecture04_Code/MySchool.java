import java.util.ArrayList;
import java.util.Collections;

public class MySchool {
	public static void main(String[] args) {
		ArrayList<MyStudent> students = new ArrayList<>();
		students.add(new MyStudent(10));
		students.add(new MyStudent(1000));
		students.add(new MyStudent(5));
		
		Collections.sort(students);
		for(MyStudent s : students) {
			System.out.println(s.scores);
		}
	}
}
