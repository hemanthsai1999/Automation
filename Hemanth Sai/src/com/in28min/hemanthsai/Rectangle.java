package com.in28min.hemanthsai;

public class Rectangle {
	private int width;
	private int height;
	public Rectangle(int width,int height) {
		this.width=width;
		this.height=height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int area() {
		return width*height;
	}
	public int perimeter() {
		return  2*(width*height);
	}
	public String toString() {
		return String.format("height:%d, width:%d, area:%d, perimeter:%d",height,width,area(),perimeter());
	}
}
