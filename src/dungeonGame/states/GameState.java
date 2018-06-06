package dungeonGame.states;

import java.awt.Graphics;

import dungeonGame.entitites.creatures.Player;
import dungeonGame.floors.Floor;
import gameLogic.Handler;

public class GameState extends States{

	private Player player;
	private Floor floor_one;
	
	public GameState(Handler handler) {
		super(handler);
		floor_one = new Floor(handler,"Resources/Floors/Floor1.txt");
		handler.setFloor(floor_one);
		player = new Player(handler, 100, 100);
		
		
		handler.getGameCamera().move(0, 0);
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
