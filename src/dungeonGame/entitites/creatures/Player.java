package dungeonGame.entitites.creatures;

import java.awt.Graphics;

import gameLogic.gfx.Assets;

public class Player extends Creature {

	public Player(float x, float y) {
		super(x, y);
	
	}

	@Override
	public void update() {
	
		
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.p_one, (int) x, (int) y, null); //convert the float variables to integers with casting because drawImage can't draw floats
		
		
	}

	
	
}
