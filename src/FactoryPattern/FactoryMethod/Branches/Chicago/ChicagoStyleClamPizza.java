package FactoryPattern.FactoryMethod.Branches.Chicago;

import FactoryPattern.FactoryMethod.PizzaTemplate;

public class ChicagoStyleClamPizza extends PizzaTemplate {
	public ChicagoStyleClamPizza() {
		name = "Chicago Style Clam PizzaTemplate";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
 
		toppings.add("Shredded Mozzarella Cheese");
		toppings.add("Frozen Clams from Chesapeake Bay");
	}
 
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
