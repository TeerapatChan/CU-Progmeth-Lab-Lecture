package Object;

import java.util.HashSet;
import java.util.Set;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		e1.setId(101);
		e2.setId(101);
		
		System.out.println(e1.equals(e2));
		
		Set<Employee> employees = new HashSet<Employee>();
		employees.add(e1);
		employees.add(e2);
		System.out.println(employees);
		
		Employee e3 = new Employee();
		e3.setId(102);
		employees.add(e3);
		System.out.println(employees);
	}

}
