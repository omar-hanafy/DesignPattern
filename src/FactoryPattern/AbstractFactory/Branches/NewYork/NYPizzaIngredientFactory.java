package FactoryPattern.AbstractFactory.Branches.NewYork;

import FactoryPattern.AbstractFactory.PizzaIngredientFactory;
import FactoryPattern.AbstractFactory.Recipe.Dough.Dough;
import FactoryPattern.AbstractFactory.Recipe.Dough.ThinCrustDough;
import FactoryPattern.AbstractFactory.Recipe.Pepperoni.Pepperoni;
import FactoryPattern.AbstractFactory.Recipe.Pepperoni.SlicedPepperoni;
import FactoryPattern.AbstractFactory.Recipe.Veggi.*;
import FactoryPattern.AbstractFactory.Recipe.cheese.Cheese;
import FactoryPattern.AbstractFactory.Recipe.cheese.ReggianoCheese;
import FactoryPattern.AbstractFactory.Recipe.clams.Clams;
import FactoryPattern.AbstractFactory.Recipe.clams.FreshClams;
import FactoryPattern.AbstractFactory.Recipe.sauce.MarinaraSauce;
import FactoryPattern.AbstractFactory.Recipe.sauce.Sauce;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough() {
        return new ThinCrustDough();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClam() {
        return new FreshClams();
    }

    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    public Veggies[] createVeggies() {
        return new Veggies[]{new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
    }


}
