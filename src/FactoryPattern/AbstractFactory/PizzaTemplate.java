package FactoryPattern.AbstractFactory;

import FactoryPattern.AbstractFactory.Recipe.Dough.Dough;
import FactoryPattern.AbstractFactory.Recipe.Pepperoni.Pepperoni;
import FactoryPattern.AbstractFactory.Recipe.Veggi.Veggies;
import FactoryPattern.AbstractFactory.Recipe.cheese.Cheese;
import FactoryPattern.AbstractFactory.Recipe.clams.Clams;
import FactoryPattern.AbstractFactory.Recipe.sauce.Sauce;

abstract public class PizzaTemplate {

    protected String name;
    public Dough dough;
    public Sauce sauce;
    public Veggies[] veggies;
    public Cheese cheese;
    public Pepperoni pepperoni;
    protected Clams clam;

    public abstract void prepare();

    void Bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void Cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void Box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("---- ").append(name).append(" ----\n");
        if (dough != null) {
            result.append(dough);
            result.append("\n");
        }
        if (sauce != null) {
            result.append(sauce);
            result.append("\n");
        }
        if (cheese != null) {
            result.append(cheese);
            result.append("\n");
        }
        if (veggies != null) {
            for (int i = 0; i < veggies.length; i++) {
                result.append(veggies[i]);
                if (i < veggies.length - 1) {
                    result.append(", ");
                }
            }
            result.append("\n");
        }
        if (clam != null) {
            result.append(clam);
            result.append("\n");
        }
        if (pepperoni != null) {
            result.append(pepperoni);
            result.append("\n");
        }
        return result.toString();
    }

}