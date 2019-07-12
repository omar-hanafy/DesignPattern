package FactoryPattern.AbstractFactory;

public abstract class PizzaStore {


    protected abstract PizzaTemplate createPizza(String item);

    PizzaTemplate orderPizza(String type) {
        PizzaTemplate pizza = createPizza(type);
        System.out.println("--- Making a " + pizza.getName() + " ---");
        pizza.prepare();
        pizza.Bake();
        pizza.Cut();
        pizza.Box();
        return pizza;
    }
}