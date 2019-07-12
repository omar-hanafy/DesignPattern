package FactoryPattern.FactoryMethod;


import FactoryPattern.FactoryMethod.Branches.Chicago.*;
import FactoryPattern.FactoryMethod.Branches.NewYork.*;

public class DependentPizzaStore {
 
	public PizzaTemplate createPizza(String style, String type) {
		PizzaTemplate pizza = null;
		if (style.equals("NY")) {
			switch (type) {
				case "cheese":
					pizza = new NYStyleCheesePizza();
					break;
				case "veggie":
					pizza = new NYStyleVeggiePizza();
					break;
				case "clam":
					pizza = new NYStyleClamPizza();
					break;
				case "pepperoni":
					pizza = new NYStylePepperoniPizza();
					break;
			}
		} else if (style.equals("Chicago")) {
			switch (type) {
				case "cheese":
					pizza = new ChicagoStyleCheesePizza();
					break;
				case "veggie":
					pizza = new ChicagoStyleVeggiePizza();
					break;
				case "clam":
					pizza = new ChicagoStyleClamPizza();
					break;
				case "pepperoni":
					pizza = new ChicagoStylePepperoniPizza();
					break;
			}
		} else {
			System.out.println("Error: invalid type of pizza");
			return null;
		}
		assert pizza != null;
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
