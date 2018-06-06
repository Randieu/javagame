package dungeonGame.tiles;

import gameLogic.gfx.Assets;

public class WallTile extends Tile {

	public WallTile(int id) {
		super(Assets.p_three, id);
	
	}
	
	@Override
	public boolean isSolid() {
		return true;
	}

}