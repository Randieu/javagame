package gameLogic;

import gameGraphic.Display;

// This will launch any display created
public class Launcher {

	public static void main(String[] args) {
	Game game =	new Game("Java Game!", 704, 512);
	game.start();
	}	

}