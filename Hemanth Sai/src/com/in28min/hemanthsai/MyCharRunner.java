package com.in28min.hemanthsai;
public class MyCharRunner {

	public static void main(String[] args) {
		MyChar mychar = new MyChar('A');
		System.out.println(mychar.Vowel());
		System.out.println(mychar.Alphabet());
		System.out.println(mychar.Digit());
		MyChar.printLowerCaseAlphabet(); 
	}

}
