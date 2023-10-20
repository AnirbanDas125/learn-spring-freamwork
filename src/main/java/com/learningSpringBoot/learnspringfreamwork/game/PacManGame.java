package com.learningSpringBoot.learnspringfreamwork.game;

public class PacManGame implements GamingConsole {
	public void up() {
		System.out.println("Going up");
	  }
	
    public void down() {
	  System.out.println("doing down");	
	 }

    public void left() {
     System.out.println("Going left");	
   }

    public void right() {  
    System.out.println("Going right");	
   }
}
