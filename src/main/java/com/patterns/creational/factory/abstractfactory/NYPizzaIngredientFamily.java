package main.java.com.patterns.creational.factory.abstractfactory;

import main.java.com.patterns.creational.factory.abstractfactory.indegredients.cheese.Cheese;
import main.java.com.patterns.creational.factory.abstractfactory.indegredients.cheese.ReggianoCheese;
import main.java.com.patterns.creational.factory.abstractfactory.indegredients.clams.Clams;
import main.java.com.patterns.creational.factory.abstractfactory.indegredients.clams.FreshClams;
import main.java.com.patterns.creational.factory.abstractfactory.indegredients.dough.Dough;
import main.java.com.patterns.creational.factory.abstractfactory.indegredients.dough.ThinCrustDough;
import main.java.com.patterns.creational.factory.abstractfactory.indegredients.pepperoni.Pepperoni;
import main.java.com.patterns.creational.factory.abstractfactory.indegredients.pepperoni.SlicedPepperoni;
import main.java.com.patterns.creational.factory.abstractfactory.indegredients.sauce.MarinaraSauce;
import main.java.com.patterns.creational.factory.abstractfactory.indegredients.sauce.Sauce;
import main.java.com.patterns.creational.factory.abstractfactory.indegredients.veggies.*;

public class NYPizzaIngredientFamily implements PizzaIngredientFamily {

    @Override
    public Dough createDough() {
        return  new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
