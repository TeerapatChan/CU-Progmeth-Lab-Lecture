package Student;

public class MySchool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UndergraduateStudent u1 = new UndergraduateStudent("Prayuth");
		u1.printName();
		Student s0 = new Student("Pop");
		Student s1 = new UndergraduateStudent("Somchai");
		Student s2 = new GraduateStudent("Peter");
		s0.printName();
		s1.printName();
		s2.printName();
		
		//สร้างเป็น Student แต่ใช้ของ Graduate
		((GraduateStudent) s2).advisorName = "Aj.Pop";
		
		
		GraduateStudent s3 = (GraduateStudent) s2;
		s3.advisorName = "Aj.Pop";
		System.out.println(s3.advisorName);
		
		/*GraduateStudent s4 = (GraduateStudent) s1;
		s4.advisorName = "Aj.Jay";*/
		
	}

}
