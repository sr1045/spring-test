package com.in28minutes.learnspringframework.game;

public class GameRunner {
	
	GameConsole game;
	public GameRunner(GameConsole game) {
		this.game = game;
	}
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Game Type :: " + game.getClass().getName());
		game.gameName();
		game.up();
		game.down();
	}
	
	
}
