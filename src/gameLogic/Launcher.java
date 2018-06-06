package gameLogic;

import gameGraphic.Display;

// This will launch any display created
public class Launcher {

	public static void main(String[] args) {
	Game game =	new Game("Java Game!", 1024, 640);
	game.start();
	}	

}