package FactoryPattern.AbstractFactory;

import FactoryPattern.AbstractFactory.Branches.Chicago.CHpizzaStore;
import FactoryPattern.AbstractFactory.Branches.NewYork.NYpizzaStore;

public class PizzaSimulator {
    public static void main(String[] args) {

        PizzaStore nyStore = new NYpizzaStore();
        PizzaStore chicagoStore = new CHpizzaStore();
        PizzaTemplate pizza;

        pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza + "\n");

        pizza = nyStore.orderPizza("clam");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza("clam");
        System.out.println("Joel ordered a " + pizza + "\n");

        pizza = nyStore.orderPizza("pepperoni");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza("pepperoni");
        System.out.println("Joel ordered a " + pizza + "\n");

        pizza = nyStore.orderPizza("veggie");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza("veggie");
        System.out.println("Joel ordered a " + pizza + "\n");

    }
}