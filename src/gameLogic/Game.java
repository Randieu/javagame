package gameLogic;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import dungeonGame.input.KeyManager;
import dungeonGame.states.BaseState;
import dungeonGame.states.BattleState;
import dungeonGame.states.GameState;
import dungeonGame.states.MainMenuState;
import dungeonGame.states.States;
import gameGraphic.Display;
import gameLogic.gfx.Assets;

// implements Runnable so you can run it on a thread, you need public void run() inside your class for this
public class Game implements Runnable {
	
	// Define your variables here
	private Display display;
	
	public int width, height;
	public String title;
	
	private boolean running = false;
	private Thread thread;
	
	private BufferStrategy bs; // It tells your computer how to draw things to the screen, we use buffers so we don't have flickering in our screen
	private Graphics g; // It draws graphics to the canvas
	
	//States
	private States gameState;
	private States mainMenuState;
	private States baseState;
	private States battleState;
	
	//Input
	private KeyManager keyManager;
	
	// Constructor for your game screens
	public Game(String title, int width, int height) {
		this.width = width;
		this.height = height;
		this.title = title;
		keyManager = new KeyManager();
	}
	
	private void init() {
		display = new Display(title, width, height);
		display.getFrame().addKeyListener(keyManager);
		Assets.init();
		
		gameState = new GameState(this);
		mainMenuState = new MainMenuState(this);
		baseState = new BaseState(this);
		battleState = new BattleState(this);
		
		States.setState(gameState);
	}
	
	
	
	private void update() {
		keyManager.update();
		
		if(States.getState() != null);
			States.getState().update();
		
	}
	
	private void render() { // Draw things to the screen
		bs = display.getCanvas().getBufferStrategy(); 
		if (bs == null) {
			display.getCanvas().createBufferStrategy(3);
			return;
		}
		g = bs.getDrawGraphics();
		//Clear screen!
		g.clearRect(0, 0, width, height);
		
		// Draw here!
		
		if(States.getState() != null);
		States.getState().render(g);
		
		
		// End drawing!
		bs.show();
		g.dispose();
		
		
	}
	// You need this to be able to run on a thread
	public void run() {
		
		init();
	
		int fps = 60; 	// this makes the game run at the same speed on different PC's (60FPS)
		double timePerTick = 1000000000 / fps;
		double delta = 0;
		long now;
		long lastTime = System.nanoTime();
		long timer = 0;
		int ticks =0;
		
		
		
		while(running) { // The Game loop!
			now = System.nanoTime();
			delta += (now - lastTime) / timePerTick;
			timer += now - lastTime;
			lastTime = now;
			
			if(delta >= 1) {
			update();
			render();
			ticks ++;
			delta --;
			}
			
			if(timer >= 1000000000) {   	//FPS counter
				System.out.println("Ticks & Frames: " + ticks);
				ticks = 0;
				timer = 0;
			}
			
		}
		
		stop(); // In case the game hasn't already been stopped
		
	}
	
	public KeyManager getKeyManager() {
		return keyManager;
		
	}
	
	
	
	// This will start the thread
	public synchronized void start() {
		if (running) // if the game is already running don't execute the code below
			return;
		running = true;
		thread = new Thread(this);
		thread.start();
		
	}
	// This will stop the thread
	public synchronized void stop() {
		if(!running) // if the game is already stopped don't execute the code below
			return;
		running = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
