package dungeonGame.entitites.creatures;

import java.awt.Graphics;

import gameLogic.Game;
import gameLogic.gfx.Assets;

public class Player extends Creature {

	private Game game;
	
	public Player(Game game, float x, float y) {
		super(x, y);
		this.game = game;
		
	}

	@Override
	public void update() {
		if(game.getKeyManager().up)
			y -= 3;
		if(game.getKeyManager().down)
			y += 3;
		if(game.getKeyManager().left)
			x -= 3;
		if(game.getKeyManager().right)
			x += 3;
		
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.p_one, (int) x, (int) y, null); //convert the float variables to integers with casting because drawImage can't draw floats
		
		
	}

	
	
}
