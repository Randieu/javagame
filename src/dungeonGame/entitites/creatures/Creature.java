package dungeonGame.entitites.creatures;

import dungeonGame.entitites.Entity;

public abstract class Creature extends Entity{

	protected int health;
	
	public Creature(float x, float y) {
		super(x, y);
		health = 10;
		
	}

	
}
