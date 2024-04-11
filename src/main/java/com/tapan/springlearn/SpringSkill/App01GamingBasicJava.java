package com.tapan.springlearn.SpringSkill;

import com.tapan.springlearn.SpringSkill.game.GameRunner;
import com.tapan.springlearn.SpringSkill.game.SuperContra;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		// var game = new MarioGame();
		// var game = new SuperContra();
		var game = new SuperContra();
		var gameRunner = new GameRunner(game);
		gameRunner.run();
	}

}
