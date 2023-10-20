package com.learningSpringBoot.learnspringfreamwork;

import org.springframework.context.annotation.Configuration;
import com.learningSpringBoot.learnspringfreamwork.game.GameRunner;
import com.learningSpringBoot.learnspringfreamwork.game.GamingConsole;
import com.learningSpringBoot.learnspringfreamwork.game.PacManGame;
import org.springframework.context.annotation.Bean;

@Configuration
public class GamingSpringConfiguration {
	
	@Bean
	public GamingConsole game() {
		return new PacManGame();
	}
	
	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		return new GameRunner(game);
	}
	

}
