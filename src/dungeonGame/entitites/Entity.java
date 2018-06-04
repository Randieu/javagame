package dungeonGame.entitites;

import java.awt.Graphics;

public abstract class Entity {

	protected float x, y; //This achieves smooth movement in the game
	
	public Entity(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public abstract void update();
	
	public abstract void render(Graphics g);
	
	
	
	
}
