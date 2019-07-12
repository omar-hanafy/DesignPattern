package FactoryPattern.FactoryMethod.Branches.Chicago;


import FactoryPattern.FactoryMethod.PizzaTemplate;

public class ChicagoStyleVeggiePizza extends PizzaTemplate {
	public ChicagoStyleVeggiePizza() {
		name = "Chicago Deep Dish Veggie PizzaTemplate";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
 
		toppings.add("Shredded Mozzarella Cheese");
		toppings.add("Black Olives");
		toppings.add("Spinach");
		toppings.add("Eggplant");
	}
 
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
