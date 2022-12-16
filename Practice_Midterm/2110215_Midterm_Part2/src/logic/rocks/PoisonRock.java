package logic.rocks;

import logic.zombies.Zombie;

public class PoisonRock extends NormalRock{
	private int damageOverTime;
	public PoisonRock(int damage, int damageOverTime) {
		// TODO Auto-generated constructor stub
		super(damage);
		this.damageOverTime = Math.max(damageOverTime, 0);
	}
	
	public int getDamageOverTime() {
		return damageOverTime;
	}
	public void setDamageOverTime(int damageOverTime) {
		this.damageOverTime = Math.max(damageOverTime, 0);
	}
	
	@Override
	public int dealDamage(Zombie zombie) {
		zombie.setDecay(damageOverTime+zombie.getDecay());
		if (zombie.getDefense() >= damage) return 0;
		int newDamage = damage - zombie.getDefense();
		zombie.setHealth(zombie.getHealth() - newDamage);
		return newDamage;
	}
	
	public String toString() {
		return "Poison Rock (" + getDamage() +", DoT = "+getDamageOverTime() +")";

	}
	
}
