package dungeonGame.states;

import java.awt.Graphics;

import gameLogic.Game;

// States are nice to use for switching between game states like start menu, actual gameplay, monster battles enz...
public abstract class States {

	private static States currentState = null; 
	
	public static void setState(States state) {
		currentState = state;
	}
	
	public static States getState() {
		return currentState;
	}
	
	
	// CLASS
	
	protected Game game;
	
	public States(Game game) {
		this.game = game;
	}
	
	public abstract void update();
	
	public abstract void render(Graphics g);
		
	
	
	
}
