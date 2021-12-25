package com.in28min.practice;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float weight = sc.nextFloat();
		float height = sc.nextFloat();
		float BMI = weight/(height*height);
		System.out.println(BMI);
		if(BMI<18.5) {
			System.out.println("UnderWeight");
		}
		else if(BMI>18.5 && BMI<24.9) {
			System.out.println("Normal");
		}
		else if(BMI>25.0 && BMI<29.9) {
			System.out.println("Over Weight");
		}
		else if(BMI>30.0 && BMI<50.00)  {
			System.out.println("Very Overweights");
		}

	}

}
