package com.in28min.hemanthsai;

public abstract class AbstractRecipe {
	public void excute() {
		prepareIngredients();
		cookRecipe();
		cleapup();
		
	}
	
	abstract void prepareIngredients();
	abstract void cookRecipe();
	abstract void cleapup();
	

}
