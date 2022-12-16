package logic;

public class OfficeWorker extends Employee{
	private String department;
	public OfficeWorker(String name, int id, String department) {
		// TODO Auto-generated constructor stub
		super(name, id, 30);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public int computeSalary() {
		// TODO Auto-generated method stub
		return BackEndAPI.calculateMonthlySalary(baseSalary, bonus, 20);
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return BackEndAPI.getOfficeWorkerDescription(id, name, department, bonus);
	}
}
