package com.in28minutes.learnspringframework.game;

public class MarioGame implements GameConsole {

	public void up() {
		// TODO Auto-generated method stub
		System.out.println("Jump");
	}

	public void down() {
		// TODO Auto-generated method stub
		System.out.println("Duck 😁");
	}

	@Override
	public void gameName() {
		// TODO Auto-generated method stub
		System.out.println("Mario Game ");
	}
	
}
