package FactoryPattern.FactoryMethod.Branches.NewYork;


import FactoryPattern.FactoryMethod.PizzaStore;
import FactoryPattern.FactoryMethod.PizzaTemplate;

public class NYPizzaStore extends PizzaStore {

	public PizzaTemplate createPizza(String item) {
		switch (item) {
			case "cheese":
				return new NYStyleCheesePizza();
			case "veggie":
				return new NYStyleVeggiePizza();
			case "clam":
				return new NYStyleClamPizza();
			case "pepperoni":
				return new NYStylePepperoniPizza();
			default:
				return null;
		}
	}
}
