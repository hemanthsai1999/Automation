package com.in28min.hemanthsai;

public class PrimeNumber {
	private int number;
	public PrimeNumber(int number) {
		this.number=number;
	}
	public boolean isPrime() {
		for(int i=2;i<=number-1;i++) {
			if(number%i== 0) {
				return false;
			}
		}
		return true;
	}

}
