package com.in28min.hemanthsai;

public class MairoGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("Jump");
		
	}

	@Override
	public void down() {
		System.out.println("Go to Hole");
		
	}

	@Override
	public void left() {
		System.out.println("");
		
	}

	@Override
	public void right() {
		System.out.println("Move Forward");
	}
	

}
