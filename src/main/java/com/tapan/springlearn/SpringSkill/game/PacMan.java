package com.tapan.springlearn.SpringSkill.game;

public class PacMan implements GamingConsole {

	@Override
	public void up() {
		System.out.println("up very high, chan di ki gal karni assi vekhya udhote toh kinne sone");

	}

	@Override
	public void down() {
		System.out.println("kinjj kara tarriff tere chhre dii..");
	}

	@Override
	public void left() {
		System.out.println("Saatho sona tera parchwa soniyee");
	}

	@Override
	public void right() {
		System.out.println("pindaa diyaan mundeya teh mardii kudiyann vanila rangiyaan...");
	}

}
