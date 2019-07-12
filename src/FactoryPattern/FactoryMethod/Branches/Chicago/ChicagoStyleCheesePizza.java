package FactoryPattern.FactoryMethod.Branches.Chicago;


import FactoryPattern.FactoryMethod.PizzaTemplate;

public class ChicagoStyleCheesePizza extends PizzaTemplate {

	public ChicagoStyleCheesePizza() {
		name = "Chicago Style Deep Dish Cheese PizzaTemplate";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
 
		toppings.add("Shredded Mozzarella Cheese");
	}
 
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
