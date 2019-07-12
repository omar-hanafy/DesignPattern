package FactoryPattern.SimpleFactory;

import FactoryPattern.SimpleFactory.Menu.*;

class SimplePizzaFactory {

	PizzaTemplate createPizza(String type) {
		PizzaTemplate pizza = null;

		switch (type) {
			case "cheese":
				pizza = new CheesePizza();
				break;
			case "pepperoni":
				pizza = new PepperoniPizza();
				break;
			case "clam":
				pizza = new ClamPizza();
				break;
			case "veggie":
				pizza = new VeggiePizza();
				break;
		}
		return pizza;
	}
}