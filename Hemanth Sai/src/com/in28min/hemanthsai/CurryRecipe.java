
package com.in28min.hemanthsai;

public class CurryRecipe extends AbstractRecipe {
	public CurryRecipe(){
		System.out.println("Lets get ready!");	
		}

	@Override
	void prepareIngredients() {
		System.out.println("Get Vegetable Cut and Ready");
		System.out.println("Get Spices Ready");
	}

	@Override
	void cookRecipe() {
		System.out.println("Stream and Fry Vegetables");
		System.out.println("Cook with Spices");
		
		
	}

	@Override
	void cleapup() {
		System.out.println("Discard unused Vegetables");
		System.out.println("Discard unused Spices");
	}
	

}
