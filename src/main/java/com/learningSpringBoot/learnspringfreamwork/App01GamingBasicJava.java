package com.learningSpringBoot.learnspringfreamwork;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learningSpringBoot.learnspringfreamwork.game.GameRunner;
import com.learningSpringBoot.learnspringfreamwork.game.MarioGame;
import com.learningSpringBoot.learnspringfreamwork.game.PacManGame;
import com.learningSpringBoot.learnspringfreamwork.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		
		var game1 = new MarioGame();
		var game2 = new SuperContraGame();
		var game3 = new PacManGame();
		var gameRunner1 = new GameRunner(game3);
		//in this line we are creating object + wiring dependency
		//this "game" object we can say a dependency
		gameRunner1.run();
		
		
		

	}

}
