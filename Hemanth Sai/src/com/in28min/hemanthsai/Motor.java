package com.in28min.hemanthsai;

public class Motor {
	private int speed;
	public Motor(int Speed) {
		this.speed=Speed;
	}
	public void start() {
		System.out.println("Bike Started");
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void IncreaseSpeed(int howmuch) {
		setSpeed(this.speed+howmuch);
	}
	public void DecreaseSpeed(int howmuch) {
		setSpeed(this.speed - howmuch);
	}

}
