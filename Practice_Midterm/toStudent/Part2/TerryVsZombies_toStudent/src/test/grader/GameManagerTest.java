package test.grader;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import logic.game.*;
import logic.rocks.*;
import logic.zombies.*;

public class GameManagerTest {
	
	@Test
	void testAttackZombie() {
		Player terry = new Player(250);
		GameManager.initializeManager(terry);
		
		PierceRock rockA = new PierceRock(25);
		NormalRock rockB = new NormalRock(13);
		
		GameManager.currentRock = rockA;
		GameManager.nextRock = rockB;
		
		Zombie zombie = new Zombie(200, 10, 2);
		
		assertEquals(25, GameManager.attackZombie(zombie));
		assertEquals(175, zombie.getHealth());
		assertEquals(rockB, GameManager.currentRock);
	}
	
}
