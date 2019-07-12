package FactoryPattern.FactoryMethod;

public abstract class PizzaStore {

	public abstract PizzaTemplate createPizza(String item);
 
	PizzaTemplate orderPizza(String type) {
		PizzaTemplate pizza = createPizza(type);
		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
