package logic;

public class Janitor extends Employee{
	private String area;
	
	public Janitor(String name, int id, String area) {
		// TODO Auto-generated constructor stub
		super(name, id, 15);
		this.area = area;
	}
	
	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public int computeSalary() {
		// TODO Auto-generated method stub
		return BackEndAPI.calculateMonthlySalary(baseSalary, bonus, 30);
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return BackEndAPI.getJanitorDescription(id, name, area, bonus);
	}
}
