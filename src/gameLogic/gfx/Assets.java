package gameLogic.gfx;

import java.awt.image.BufferedImage;

public class Assets {

	private static final int width = 32, height = 32;
	
	public static BufferedImage p_one, p_two, p_three, p_four, p_five;
	
	public static void init() {
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/Textures/test sprite sheet.png"));
		
		p_one = sheet.crop(0, 0, width, height);
		p_two = sheet.crop(width, 0, width, height);
		p_three = sheet.crop(width * 2, 0, width, height);
		p_four = sheet.crop(width * 3, 0, width, height);
		p_five = sheet.crop(0, height, width, height);
		
	}
	
}
