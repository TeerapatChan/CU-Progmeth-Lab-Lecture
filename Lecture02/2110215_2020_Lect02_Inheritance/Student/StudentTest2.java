package Student;

public class StudentTest2 {
	public static void main(String[] args) {
		Student s1 = new UndergraduateStudent("Toey");
		Student s2 = new GraduateStudent("Nat");
		checkStatus(s1);
		checkStatus(s2);
		
		UndergraduateStudent s3 = new UndergraduateStudent("Pravit");
		checkStatus(s3);
		
		System.out.println(s1 instanceof UndergraduateStudent);
		System.out.println(s1 instanceof Student);
		System.out.println(s1 instanceof GraduateStudent);
	}

	public static void checkStatus(Student s) {
		if (s instanceof UndergraduateStudent) {
			System.out.println("You are undergraduate student.");
		} else if (s instanceof GraduateStudent) {
			System.out.println("You are graduate student.");
		}
	}
}
