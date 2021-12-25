package com.in28min.hemanthsai;
public class OperatorChoice {
	private int number1;
	private int number2;
	private int choice;
	
	public OperatorChoice(int number1, int number2, int choice) {
		this.number1 = number1;
		this.number2 = number2;
		this.choice = choice;
	}

	public void operate() {
		System.out.printf("number1 : %d", number1).println();
		System.out.printf("number2 : %d", number2).println();
		System.out.printf("choice : %d", choice).println();
		switch(choice) {
		case 1 : System.out.printf("result : %d", number1 + number2).println();
			break;
		case 2 : System.out.printf("result : %d", number1 - number2).println();
			break;
		case 3 : System.out.printf("result : %d", number1 * number2).println();
			break;
		case 4 : System.out.printf("result : %d", number1 / number2).println();
			break;
		default : System.out.println("Invalid Operation");
			break;
		}
	}
}
