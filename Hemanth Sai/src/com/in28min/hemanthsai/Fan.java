package com.in28min.hemanthsai;

public class Fan {
	private String make;
	private double radius;
	private String color;
	private boolean isOn;
	private byte speed;
	public Fan(String make,double radius,String color) {
		this.make=make;
		this.radius=radius;
		this.color=color;
	}
	public byte getSpeed() {
		return speed;
	}
	public void setSpeed(byte speed) {
		this.speed = speed;
	}
	public String toString() {
		return String.format("make :%s, radius:%f, color:%s, isOn:%b, speed:%d",make,radius,color,isOn,speed);
	}
	

}
