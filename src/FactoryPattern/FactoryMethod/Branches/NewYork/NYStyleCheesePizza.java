package FactoryPattern.FactoryMethod.Branches.NewYork;


import FactoryPattern.FactoryMethod.PizzaTemplate;

public class NYStyleCheesePizza extends PizzaTemplate {

	public NYStyleCheesePizza() {
		name = "NY Style Sauce and Cheese PizzaTemplate";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
 
		toppings.add("Grated Reggiano Cheese");
	}
}
