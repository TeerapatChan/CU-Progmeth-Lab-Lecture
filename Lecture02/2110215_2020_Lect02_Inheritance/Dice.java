import java.util.Objects;

public class Dice {
	private int faceValue;
	private String color;
	
	public Dice(int faceValue, String color) {
		super();
		this.faceValue = faceValue;
		this.color = color;
	}

	public Dice() {
		super();
		this.faceValue = 1;
		this.color = "white";
	}

	public int getFaceValue() {
		return faceValue;
	}

	public void setFaceValue(int faceValue) {
		this.faceValue = faceValue;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Dice [faceValue=" + faceValue + ", color=" + color + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dice other = (Dice) obj;
		return Objects.equals(color, other.color) && faceValue == other.faceValue;
	}
	
}
