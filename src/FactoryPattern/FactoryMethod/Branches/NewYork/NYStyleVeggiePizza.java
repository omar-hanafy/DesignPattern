package FactoryPattern.FactoryMethod.Branches.NewYork;


import FactoryPattern.FactoryMethod.PizzaTemplate;

public class NYStyleVeggiePizza extends PizzaTemplate {

	public NYStyleVeggiePizza() {
		name = "NY Style Veggie PizzaTemplate";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
 
		toppings.add("Grated Reggiano Cheese");
		toppings.add("Garlic");
		toppings.add("Onion");
		toppings.add("Mushrooms");
		toppings.add("Red Pepper");
	}
}
