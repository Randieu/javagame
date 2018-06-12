package dungeonGame.states;

import java.awt.Graphics;

import gameLogic.Handler;
import gameLogic.gfx.Assets;
import gameLogic.ui.ClickListener;
import gameLogic.ui.UIImageButton;
import gameLogic.ui.UIManager;

public class MainMenuState extends States {

	private UIManager uiManager;
	
	public MainMenuState(Handler handler) {
		super(handler);
		uiManager = new UIManager(handler);
		handler.getMouseManager().setUIManager(uiManager);
	}
	
	@Override
	public void update() {		
		uiManager.update();
		
		uiManager.addObject(new UIImageButton(200, 200, 64, 64, Assets.btn_start, new ClickListener(){

			@Override
			public void onClick() {
				States.setState(handler.getGame().gameState);
				
			}
		})); 
			
		
	}

	@Override
	public void render(Graphics g) {
		uiManager.render(g);
		
	}

	
	
	
}
