package dungeonGame.states;

import java.awt.Graphics;

import dungeonGame.entitites.creatures.Player;
import dungeonGame.floors.Floor;
import gameLogic.Game;

public class GameState extends States{

	private Player player;
	private Floor floor_one;
	
	public GameState(Game game) {
		super(game);
		player = new Player(game, 100, 100);
		floor_one = new Floor(game,"Resources/Floors/Floor1.txt");
		
		game.getGameCamera().move(0, 0);
	}
	
	@Override
	public void update() {
		floor_one.update();
		player.update();
		
	}

	@Override
	public void render(Graphics g) {
		floor_one.render(g);
		player.render(g);
	}

}
