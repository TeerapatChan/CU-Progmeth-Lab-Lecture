
public class SimpleDice {
	final static int MAX = 6;
	private int faceValue;
	//static แชร์ตัวแปรใน class เดียวกันใช้
	static int count = 0;

	//Constructor (__init__)
	public SimpleDice(int faceValue) {
		// faceValue = val
		this.faceValue = faceValue;
	}
	
	//Overloading method ซ้ำกับ Method ด้านบนแต่คนละ input เป็น Constructor เหมือนกัน
	public SimpleDice() {
		this(1); //เรียก Constructor
	}
	
	public int roll() {
		faceValue = (int) (Math.random() * MAX) + 1;
		return faceValue;
	}
	
	public void setFaceValue(int v) {
		if (v <= 1) v = 1;
		else if (v > MAX) v = MAX;
		this.faceValue = v;
	}

	public int getFaceValue() {
		return this.faceValue;
	}
	
	public static void showCount() {
		System.out.println(count);
	}
	
	//ทำให้ใช้ print d1 ได้เลย
	public String toString() {
        return "My face is "+this.faceValue;
    }
	
	public boolean equals(Object o) {
		SimpleDice d = (SimpleDice) o;
		return this.faceValue == d.faceValue;
	}
	
}
