package com.in28min.hemanthsai;

public class MotorRunner {

	public static void main(String[] args) {
		Motor bmw = new Motor(5);
		Motor Honda = new Motor(5);
		Honda.start();
		bmw.start();
		Honda.setSpeed(100);
		bmw.setSpeed(50);
		System.out.println(Honda.getSpeed());
		System.out.println(bmw.getSpeed());
		bmw.IncreaseSpeed(50);
		Honda.DecreaseSpeed(5);
		System.out.println(Honda.getSpeed());
		System.out.println(bmw.getSpeed());
	}

}
