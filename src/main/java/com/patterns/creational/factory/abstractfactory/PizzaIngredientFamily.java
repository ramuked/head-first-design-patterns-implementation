package main.java.com.patterns.creational.factory.abstractfactory;

import main.java.com.patterns.creational.factory.abstractfactory.indegredients.cheese.Cheese;
import main.java.com.patterns.creational.factory.abstractfactory.indegredients.clams.Clams;
import main.java.com.patterns.creational.factory.abstractfactory.indegredients.dough.Dough;
import main.java.com.patterns.creational.factory.abstractfactory.indegredients.pepperoni.Pepperoni;
import main.java.com.patterns.creational.factory.abstractfactory.indegredients.sauce.Sauce;
import main.java.com.patterns.creational.factory.abstractfactory.indegredients.veggies.Veggies;

public interface PizzaIngredientFamily {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}
