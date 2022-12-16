package logic.rocks;

import logic.zombies.Zombie;

public class NormalRock {
	protected int damage;
	public NormalRock(int damage) {
		// TODO Auto-generated constructor stub
		this.damage = Math.max(0, damage);
	}
	
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = Math.max(damage, 0);
	}
		
	public int dealDamage(Zombie zombie) {
		if (zombie.getDefense() >= damage) return 0;
		int newDamage = damage - zombie.getDefense();
		zombie.setHealth(zombie.getHealth() - newDamage);
		return newDamage;
	}
	
	public String toString() {
		return "Normal Rock (" + getDamage() + ")";
	}
}
