package FactoryPattern.FactoryMethod.Branches.NewYork;

import FactoryPattern.FactoryMethod.PizzaTemplate;

public class NYStyleClamPizza extends PizzaTemplate {

	public NYStyleClamPizza() {
		name = "NY Style Clam PizzaTemplate";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
 
		toppings.add("Grated Reggiano Cheese");
		toppings.add("Fresh Clams from Long Island Sound");
	}
}
