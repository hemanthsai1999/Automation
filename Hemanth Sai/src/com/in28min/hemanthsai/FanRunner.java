package com.in28min.hemanthsai;

public class FanRunner {

	public static void main(String[] args) {
		Fan fan = new Fan("Crompton",1.25,"Green");
		fan.setSpeed((byte)5);
		System.out.println(fan);

	}

}
