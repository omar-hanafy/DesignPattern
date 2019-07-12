package FactoryPattern.AbstractFactory.Branches.NewYork;

import FactoryPattern.AbstractFactory.*;
import FactoryPattern.AbstractFactory.Menu.*;


public class NYpizzaStore extends PizzaStore {

    protected PizzaTemplate createPizza(String item) {
        PizzaTemplate pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        switch (item) {
            case "cheese":

                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("New York Style Cheese PizzaTemplate");

                break;
            case "veggie":

                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("New York Style Veggie PizzaTemplate");

                break;
            case "clam":

                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("New York Style Clam PizzaTemplate");

                break;
            case "pepperoni":

                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("New York Style Pepperoni PizzaTemplate");

                break;
        }
        return pizza;
    }
}