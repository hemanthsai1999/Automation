package com.in28min.practice;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike motor = new MotorBike();
		motor.start();
		motor.setSpeed(100);
		System.out.printf("The Current speed is: %d",motor.getSpeed()).println();
		

	}

}
