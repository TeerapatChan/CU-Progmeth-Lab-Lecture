class MyCasino {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/********************************
		SimpleDice d1 = new SimpleDice(5);
		SimpleDice d2
		d2 = d1;
		System.out.println(d1.faceValue);
		System.out.println(d2.faceValue);
		*********************************/
		
		/************************************
		SimpleDice d1 = new SimpleDice(5);
		SimpleDice d2 = new SimpleDice();
		d1.count++;
		d2.count++;
		System.out.println(d1.count);
		System.out.println(d2.count);
		System.out.println(SimpleDice.count);
		SimpleDice.showCount();
		d1.showCount();
		************************************/
		/**************************************
		SimpleDice d1 = new SimpleDice();
		d1.setFaceValue(-1);
		//System.out.println(d1.faceValue))); 
		System.out.println(d1.getFaceValue());
		**************************************/
		SimpleDice d1 = new SimpleDice(5);
		SimpleDice d2 = new SimpleDice(5);
		System.out.println(d1.equals(d2));
	}

}
