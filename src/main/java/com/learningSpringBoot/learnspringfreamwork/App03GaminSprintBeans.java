package com.learningSpringBoot.learnspringfreamwork;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.learningSpringBoot.learnspringfreamwork.game.GameRunner;
import com.learningSpringBoot.learnspringfreamwork.game.GamingConsole;
import com.learningSpringBoot.learnspringfreamwork.game.MarioGame;
import com.learningSpringBoot.learnspringfreamwork.game.PacManGame;
import com.learningSpringBoot.learnspringfreamwork.game.SuperContraGame;

public class App03GaminSprintBeans {

	public static void main(String[] args) {
		
		try(var gameSpringContext = 
				new AnnotationConfigApplicationContext(GamingSpringConfiguration.class);){
			
			gameSpringContext.getBean(GamingConsole.class).up();
			gameSpringContext.getBean(GameRunner.class).run();
			
		}
		
		
		
		
		
		
		

	}

}
