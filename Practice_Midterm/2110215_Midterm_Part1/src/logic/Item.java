package logic;

import java.util.Objects;

public class Item {
	private String name;
	private int pricePerPiece;
	
	public Item(String name, int pricePerpiece) {
		this.name = name;
		this.pricePerPiece = Math.max(pricePerpiece, 1);
	}
	//Method
	public void setPricePerPiece(int pricePerPiece) {
		this.pricePerPiece = Math.max(pricePerPiece, 1);
	}
	public int getPricePerPiece() {
		return pricePerPiece;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		return Objects.equals(name, other.name);
	}
	
	
}
