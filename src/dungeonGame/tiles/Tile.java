package dungeonGame.tiles;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Tile {

	// Static here
	public static Tile[] tiles = new Tile[256];
	public static Tile wallTile = new WallTile(0); // It is a tile but it has a class of its own
	public static Tile pathTile = new PathTile(1);
	public static Tile unexploredTile = new UnexploredTile(2);
	
	
	// Class
	public static final int TILEWIDTH = 64, TILEHEIGHT = 64;
	
	protected BufferedImage texture;
	protected final int id; //every id has to have is own unique id
	
	public Tile(BufferedImage texture, int id) {
		this.texture = texture;
		this.id = id;
		
		tiles[id] = this;
	}
	
	public void update() {
		
	}
	
	public void render(Graphics g, int x, int y) {
		g.drawImage(texture, x, y, TILEWIDTH, TILEHEIGHT, null);
	}
	
	public boolean isSolid() {
		return false;
	}
	
	public int getId() {
		return id;
	}
	
}
