package FactoryPattern.SimpleFactory.Menu;

import FactoryPattern.SimpleFactory.PizzaTemplate;

public class CheesePizza extends PizzaTemplate {
	public CheesePizza() {
		name = "Cheese Pizza";
		dough = "Regular Crust";
		sauce = "Marinara Pizza Sauce";
		toppings.add("Fresh Mozzarella");
		toppings.add("Parmesan");
	}
}
