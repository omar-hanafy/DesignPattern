package FactoryPattern.AbstractFactory.Menu;

import FactoryPattern.AbstractFactory.PizzaIngredientFactory;
import FactoryPattern.AbstractFactory.PizzaTemplate;

public class CheesePizza extends PizzaTemplate {
	PizzaIngredientFactory ingredientFactory;
 
	public CheesePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
 
	public void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
	}
}
