
public class SimpleDice3 {
	final static int MAX = 6;
	private int faceValue;

	public SimpleDice3(int faceValue) {
		// faceValue = val
		this.faceValue = faceValue;
	}

	public SimpleDice3() {
		this.faceValue = this.roll();
	}

	public int roll() {
		faceValue = (int) (Math.random() * MAX) + 1;
		return faceValue;
	}

	public int getFaceValue() {
		return faceValue;
	}

	public void setFaceValue(int faceValue) {
		this.faceValue = faceValue;
	}

}
