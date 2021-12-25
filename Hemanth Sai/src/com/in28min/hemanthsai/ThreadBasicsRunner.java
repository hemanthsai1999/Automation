package com.in28min.hemanthsai;

class Task1 extends Thread{
	public void run() {
		System.out.println("Task1 Started");
		//Task 1
		for(int i=0;i<=10;i++) {
			System.out.print(i+" ");
		}
		System.out.println("\n Task1 Done");
	}
}
class Task2 implements Runnable{
@Override
	public void run() {
		System.out.println("Task12 Started");
		//Task 1
		for(int i=11;i<=20;i++) {
			System.out.print(i+" ");
		}
		System.out.println("\n Task2 Done");
	}
}

public class ThreadBasicsRunner {

	public static void main(String[] args) {
		
		Task1 task1 = new Task1();
		task1.start();
		Task2 task2 = new Task2();
		Thread task2Thread = new Thread(task2);
		task2Thread.start();
		
		//task1.join();
		//task2Thread.join();
		
		//Task 3
		for(int i=21;i<=30;i++) {
			System.out.print(i+" ");
		}
		System.out.println("\n Task3 Done");

	}
}
