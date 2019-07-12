package FactoryPattern.SimpleFactory.Menu;

import FactoryPattern.SimpleFactory.PizzaTemplate;

public class ClamPizza extends PizzaTemplate {
	public ClamPizza() {
		name = "Clam Pizza";
		dough = "Thin crust";
		sauce = "White garlic sauce";
		toppings.add("Clams");
		toppings.add("Grated parmesan cheese");
	}
}
