package FactoryPattern.FactoryMethod.Branches.NewYork;


import FactoryPattern.FactoryMethod.PizzaTemplate;

public class NYStylePepperoniPizza extends PizzaTemplate {

	public NYStylePepperoniPizza() {
		name = "NY Style Pepperoni PizzaTemplate";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
 
		toppings.add("Grated Reggiano Cheese");
		toppings.add("Sliced Pepperoni");
		toppings.add("Garlic");
		toppings.add("Onion");
		toppings.add("Mushrooms");
		toppings.add("Red Pepper");
	}
}
