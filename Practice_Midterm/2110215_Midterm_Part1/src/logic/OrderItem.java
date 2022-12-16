package logic;

public class OrderItem {
	private Item item;
	private int itemAmount;
	
	public OrderItem(Item item, int itemAmount) {
		// TODO Auto-generated constructor stub
		this.item = item;
		this.itemAmount = Math.max(itemAmount, 0);
	}
	
	public void increaseItemAmount(int amount) {
		if (amount > 0)
			this.itemAmount += amount;
	}
	
	public int calculateTotalPrice() {
		return itemAmount * item.getPricePerPiece();
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public int getItemAmount() {
		return itemAmount;
	}

	public void setItemAmount(int itemAmount) {
		this.itemAmount = Math.max(itemAmount, 0);
	}
	
	
}
