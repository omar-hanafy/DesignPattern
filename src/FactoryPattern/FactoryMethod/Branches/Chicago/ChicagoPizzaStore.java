package FactoryPattern.FactoryMethod.Branches.Chicago;


import FactoryPattern.FactoryMethod.PizzaStore;
import FactoryPattern.FactoryMethod.PizzaTemplate;

public class ChicagoPizzaStore extends PizzaStore {

	public PizzaTemplate createPizza(String item) {
		switch (item) {
			case "cheese":
				return new ChicagoStyleCheesePizza();
			case "veggie":
				return new ChicagoStyleVeggiePizza();
			case "clam":
				return new ChicagoStyleClamPizza();
			case "pepperoni":
				return new ChicagoStylePepperoniPizza();
			default:
				return null;
		}
	}
}
