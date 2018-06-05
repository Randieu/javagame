package dungeonGame.entitites.creatures;

import java.awt.Graphics;

import gameLogic.Game;
import gameLogic.gfx.Assets;

public class Player extends Creature {

	private Game game;
	
	public Player(Game game, float x, float y) {
		super(x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT);
		this.game = game;
		
	}

	@Override
	public void update() {
		getInput();
		move();
	}
	
	private void getInput() {
		xMove = 0;
		yMove = 0;
		
		if(game.getKeyManager().up)
			yMove = -speed;
		if(game.getKeyManager().down)
			yMove = speed;
		if(game.getKeyManager().left)
			xMove = -speed;
		if(game.getKeyManager().right)
			xMove = speed;
		
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.p_one, (int) x, (int) y, width, height, null); //convert the float variables to integers with casting because drawImage can't draw floats
		
		
	}

	
	
}
