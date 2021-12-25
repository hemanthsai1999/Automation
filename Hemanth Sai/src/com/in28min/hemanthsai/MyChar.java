package com.in28min.hemanthsai;

public class MyChar {
	private char ch;
	public MyChar(char ch) {
		this.ch=ch;
	}
	public boolean Vowel() {
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') 
			return true;
		return false;
	}
	public boolean Alphabet() {
		if(ch>=97 && ch<=122 || ch>=65 && ch<=90)
			return true;
		return false;
	}
	public boolean Digit() {
		if(ch>=48 && ch<=57)
			return true;
		return false;
	}
	public static void printLowerCaseAlphabet() {
		for(char ch='a';ch<='z';ch++) {
			System.out.println(ch);
		}
		
	}
	
	
	

}
