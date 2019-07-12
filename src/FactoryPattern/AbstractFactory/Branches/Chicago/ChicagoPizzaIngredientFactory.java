package FactoryPattern.AbstractFactory.Branches.Chicago;


import FactoryPattern.AbstractFactory.PizzaIngredientFactory;
import FactoryPattern.AbstractFactory.Recipe.Dough.Dough;
import FactoryPattern.AbstractFactory.Recipe.Dough.ThickCrustDough;
import FactoryPattern.AbstractFactory.Recipe.Pepperoni.Pepperoni;
import FactoryPattern.AbstractFactory.Recipe.Pepperoni.SlicedPepperoni;
import FactoryPattern.AbstractFactory.Recipe.Veggi.BlackOlives;
import FactoryPattern.AbstractFactory.Recipe.Veggi.Eggplant;
import FactoryPattern.AbstractFactory.Recipe.Veggi.Spinach;
import FactoryPattern.AbstractFactory.Recipe.Veggi.Veggies;
import FactoryPattern.AbstractFactory.Recipe.cheese.Cheese;
import FactoryPattern.AbstractFactory.Recipe.cheese.MozzarellaCheese;
import FactoryPattern.AbstractFactory.Recipe.clams.Clams;
import FactoryPattern.AbstractFactory.Recipe.clams.FrozenClams;
import FactoryPattern.AbstractFactory.Recipe.sauce.PlumTomatoSauce;
import FactoryPattern.AbstractFactory.Recipe.sauce.Sauce;

public class ChicagoPizzaIngredientFactory
        implements PizzaIngredientFactory {

    public Dough createDough() {
        return new ThickCrustDough();
    }

    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    public Veggies[] createVeggies() {
        return new Veggies[]{
                new BlackOlives(),
                new Spinach(),
                new Eggplant()};
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClam() {
        return new FrozenClams();
    }
}
