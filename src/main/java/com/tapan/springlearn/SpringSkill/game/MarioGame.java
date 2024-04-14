package com.tapan.springlearn.SpringSkill.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements GamingConsole {
	@Override
	public void up() {
		System.out.println("Jump");
	}

	@Override
	public void down() {
		System.out.println("sit down or lay down");
	}

	@Override
	public void left() {
		System.out.println("go backward direction");
	}

	@Override
	public void right() {
		System.out.println("accelerate and run forward with gun");
	}



}
