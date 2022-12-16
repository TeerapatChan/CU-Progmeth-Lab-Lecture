package logic;

import java.util.ArrayList;

public class Order {
	private ArrayList<OrderItem> orderItemList;
	private static int totalOrderCount = 0;
	private int orderNumber;
	
	public Order() {
		// TODO Auto-generated constructor stub
		this.orderItemList = new ArrayList<>();
		this.totalOrderCount = 1;
	}

	public OrderItem addItem(Item item, int amount) {
		// TODO
		// Loop the orderItemList to find if item of any orderItem equals to the given item
		// if there is orderItem with given item, increase that orderItem itemAmount with amount
		// and return that orderItem
		if (orderItemList.size() == 0) {
			OrderItem newOrder = new OrderItem(item, Math.max(amount, 0));
			orderItemList.add(newOrder);
			return newOrder;
		}
		boolean checkIn = false;
		int j = 0;
		for(int i = 0; i < orderItemList.size(); i++) {
			if (orderItemList.get(i).getItem().equals(item)) { 
				checkIn = true;
				int newAmount;
				newAmount = orderItemList.get(i).getItemAmount() + Math.max(amount, 0);
				orderItemList.get(i).setItemAmount(newAmount);
				j = i;
			}
		}
		if (checkIn == false) {
			OrderItem newOrder = new OrderItem(item, Math.max(amount, 0));
			orderItemList.add(newOrder);
			return newOrder;
		}
		return orderItemList.get(j);
			
		// else create new orderItem with given item and amount, then return the new orderItem
	}

	public int calculateOrderTotalPrice() {
		// TODO
		// Calculate total price of the order by summing total price of each orderItem in orderItemList
		if (orderItemList.size() == 0) return 0;
		int sum = 0;
		for(int i = 0; i < orderItemList.size();i++) {
			sum += orderItemList.get(i).calculateTotalPrice();
		}
		return sum;
	}

	public static int getTotalOrderCount() {
		return totalOrderCount;
	}
	
	public static void resetTotalOrderCount() {
		totalOrderCount = 0;
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public ArrayList<OrderItem> getOrderItemList() {
		return orderItemList;
	}
	
	
}
