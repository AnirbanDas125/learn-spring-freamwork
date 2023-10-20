package com.learningSpringBoot.learnspringfreamwork.game;


public class GameRunner {
		
	private GamingConsole game; //this interface type variable is working cz of the both the game classes implements the interface  
	
	public GameRunner(GamingConsole game){
	 this.game = game;
	}
		
	public void run() {
	  System.out.println("Running game "+ game);
	  game.up();
	  game.down();
	  game.left();
	  game.right();
		
	}
	
	
}
