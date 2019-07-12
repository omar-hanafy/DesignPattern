package FactoryPattern.SimpleFactory;

import java.util.ArrayList;

abstract public class PizzaTemplate {
	public String name;
	public String dough;
	public	String sauce;
	public	ArrayList<String> toppings = new ArrayList<>();

	public String getName() {
		return name;
	}

	public void prepare() {
		System.out.println("Preparing " + name);
	}

	void bake() {
		System.out.println("Baking " + name);
	}

	public void cut() {
		System.out.println("Cutting " + name);
	}

	void box() {
		System.out.println("Boxing " + name);
	}

	public String toString() {
		// code to display pizza name and ingredients
		StringBuilder display = new StringBuilder();
		display.append("---- ").append(name).append(" ----\n");
		display.append(dough).append("\n");
		display.append(sauce).append("\n");
		for (String topping : toppings) {
			display.append(topping).append("\n");
		}
		return display.toString();
	}
}