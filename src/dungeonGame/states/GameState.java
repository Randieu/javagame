package dungeonGame.states;

import java.awt.Graphics;

import dungeonGame.entitites.creatures.Player;
import gameLogic.Game;

public class GameState extends States{

	private Player player;
	
	public GameState(Game game) {
		super(game);
		player = new Player(game, 100, 100);
		
	}
	
	@Override
	public void update() {
		player.update();
		
	}

	@Override
	public void render(Graphics g) {
		player.render(g);
	}

}
