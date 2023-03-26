package com.in28minutes.learnspringframework.game;

public class PacMan implements GameConsole {

	@Override
	public void gameName() {
		// TODO Auto-generated method stub
		System.out.println("PacMan Game");
	}

	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("PacMan move UP ");
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("Pac Man move down");
	}

}
