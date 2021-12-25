package com.in28min.hemanthsai;

public class MicrowaveRecipe extends AbstractRecipe {
	public MicrowaveRecipe(){
		System.out.println("Lets get ready!");	
		}

	@Override
	void prepareIngredients() {
		System.out.println("Get Vegetable Cut and Ready");
		System.out.println("Switch on Microwave");
	}

	@Override
	void cookRecipe() {
		System.out.println("Stream and Fry Vegetables");
		System.out.println("Microwave Vegtables");
	}

	@Override
	void cleapup() {
		System.out.println("Switch Off Microwave");
		System.out.println("Discard unused Vegetables");
	}

}
