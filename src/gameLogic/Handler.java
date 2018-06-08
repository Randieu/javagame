package gameLogic;

import dungeonGame.floors.Floor;
import dungeonGame.input.KeyManager;
import dungeonGame.input.MouseManager;
import gameLogic.gfx.GameCamera;

public class Handler {

	private Game game;
	private Floor floor;
	
	public Handler(Game game) {
		this.game = game;
	}
	
	public GameCamera getGameCamera() {
		return game.getGameCamera();
	}
	
	public KeyManager getKeyManager() {
		return game.getKeyManager();
	}
	
	public MouseManager getMouseManager() {
		return game.getMouseManager();
	}
	
	public int getWidth() {
		return game.getWidht();
	}
	
	public int getheight() {
		return game.getHeight();
	}
		
	public Game getGame() {
		return game;
	}


	public void setGame(Game game) {
		this.game = game;
	}


	public Floor getFloor() {
		return floor;
	}


	public void setFloor(Floor floor) {
		this.floor = floor;
	}

	
	
}
