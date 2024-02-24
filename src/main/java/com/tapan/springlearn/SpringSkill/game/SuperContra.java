package com.tapan.springlearn.SpringSkill.game;

public class SuperContra implements GamingConsole {
	@Override
	public void up() {
		System.out.println("shoot");

	}

	@Override
	public void down() {
		System.out.println("shoot down side");

	}

	@Override
	public void left() {
		System.out.println("shoot around");

	}

	@Override
	public void right() {
		System.out.println("shoot while running");

	}

}
