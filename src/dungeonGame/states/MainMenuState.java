package dungeonGame.states;

import java.awt.Color;
import java.awt.Graphics;

import gameLogic.Handler;

public class MainMenuState extends States {

	public MainMenuState(Handler handler) {
		super(handler);
		
	}
	
	@Override
	public void update() {		
		if(handler.getMouseManager().isLeftPressed() && handler.getMouseManager().isRightPressed())
			States.setState(handler.getGame().gameState);
		
	}

	@Override
	public void render(Graphics g) {
		g.setColor(Color.ORANGE);
		g.fillRect(handler.getMouseManager().getMouseX(), handler.getMouseManager().getMouseY(), 8, 8);
		
	}

	
	
	
}
