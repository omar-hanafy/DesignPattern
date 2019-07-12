package FactoryPattern.FactoryMethod.Branches.Chicago;


import FactoryPattern.FactoryMethod.PizzaTemplate;

public class ChicagoStylePepperoniPizza extends PizzaTemplate {
	public ChicagoStylePepperoniPizza() {
		name = "Chicago Style Pepperoni PizzaTemplate";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
 
		toppings.add("Shredded Mozzarella Cheese");
		toppings.add("Black Olives");
		toppings.add("Spinach");
		toppings.add("Eggplant");
		toppings.add("Sliced Pepperoni");
	}
 
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
