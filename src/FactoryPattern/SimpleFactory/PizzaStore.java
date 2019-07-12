package FactoryPattern.SimpleFactory;

public class PizzaStore {
	private SimplePizzaFactory factory;
 
	public PizzaStore(SimplePizzaFactory factory) { 
		this.factory = factory;
	}
 
	PizzaTemplate orderPizza(String type) {
		PizzaTemplate pizza;
 
		pizza = factory.createPizza(type);
 
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

}