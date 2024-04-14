package com.tapan.springlearn.SpringSkill.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	private GamingConsole game;
//	private MarioGame game1;
//	private SuperContra game2;

//	public GameRunner(MarioGame game1) {
//		this.game1 = game1;
//	}

	public GameRunner(@Qualifier("PacmanQualifier") GamingConsole game) {
		this.game = game;
	}

	public void run() {
		System.out.println("let's play..." + game);
		game.up();
		game.down();
		game.left();
		game.right();

	}

}
