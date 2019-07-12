package FactoryPattern.AbstractFactory.Branches.Chicago;

import FactoryPattern.AbstractFactory.*;
import FactoryPattern.AbstractFactory.Menu.*;

public class CHpizzaStore extends PizzaStore {

    protected PizzaTemplate createPizza(String item) {
        PizzaTemplate pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        switch (item) {
            case "cheese":

                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("Chicago Style Cheese PizzaTemplate");

                break;
            case "veggie":

                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("Chicago Style Veggie PizzaTemplate");

                break;
            case "clam":

                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("Chicago Style Clam PizzaTemplate");

                break;
            case "pepperoni":

                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("Chicago Style Pepperoni PizzaTemplate");

                break;
        }
        return pizza;
    }
}
