class Temp implements Measurable{
	@Override
	public double getMeasure() {
		// TODO Auto-generated method stub
		
		return 0;
	}
}
public class VariableScopeExample {
	int a = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Anonymous inner class
		Measurable m = new Temp();
		Measurable m2 = new Measurable() {
			
			@Override
			public double getMeasure() {
				// TODO Auto-generated method stub
				return 2;
			}
		};
		Measurable m3 = new Measurable() {
			@Override
			public double getMeasure() {
				// TODO Auto-generated method stub
				return 3;
			}
		};
	}

}