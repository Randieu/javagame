package dungeonGame.entitites.statics;

import dungeonGame.tiles.Tile;
import gameLogic.Handler;

public class Treasure extends StaticEntity {

	public Treasure(Handler handler, float x, float y, int width, int height) {
		super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);
		
	}

}
