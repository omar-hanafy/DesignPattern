package FactoryPattern.AbstractFactory;

import FactoryPattern.AbstractFactory.Recipe.Dough.Dough;
import FactoryPattern.AbstractFactory.Recipe.Pepperoni.Pepperoni;
import FactoryPattern.AbstractFactory.Recipe.Veggi.Veggies;
import FactoryPattern.AbstractFactory.Recipe.cheese.Cheese;
import FactoryPattern.AbstractFactory.Recipe.clams.Clams;
import FactoryPattern.AbstractFactory.Recipe.sauce.Sauce;

public interface PizzaIngredientFactory {
 
	Dough createDough();
	 Sauce createSauce();
	 Cheese createCheese();
	 Veggies[] createVeggies();
	 Pepperoni createPepperoni();
	 Clams createClam();
 
}
