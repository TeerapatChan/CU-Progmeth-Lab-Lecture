
public class SimpleDice {
	final static int MAX = 6;
	int faceValue;

	public SimpleDice(int faceValue) {
		// faceValue = val
		this.faceValue = faceValue;
	}

	public int roll() {
		faceValue = (int) (Math.random() * MAX) + 1;
		return faceValue;
	}
}
