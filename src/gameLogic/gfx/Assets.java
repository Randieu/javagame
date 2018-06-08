package gameLogic.gfx;

import java.awt.image.BufferedImage;

public class Assets {

	private static final int width = 64, height = 64;
	
	public static BufferedImage p_one, p_two, p_three, p_four, p_five;
	
	//If you want to have animations you can do that with an Array
	
	
	public static void init() {
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/Textures/TestSpriteOne.png"));
		
		p_one = sheet.crop(0, 0, width, height);
		p_two = sheet.crop(width, 0, width, height);
		p_three = sheet.crop(width * 2, 0, width, height);
		p_four = sheet.crop(width * 3, 0, width, height);
		p_five = sheet.crop(0, height, width, height);
		
	}
	
}
