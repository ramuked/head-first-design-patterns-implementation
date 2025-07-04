package main.java.com.patterns.creational.factory.abstractfactory;

import main.java.com.patterns.creational.factory.abstractfactory.indegredients.cheese.Cheese;
import main.java.com.patterns.creational.factory.abstractfactory.indegredients.clams.Clams;
import main.java.com.patterns.creational.factory.abstractfactory.indegredients.dough.Dough;
import main.java.com.patterns.creational.factory.abstractfactory.indegredients.pepperoni.Pepperoni;
import main.java.com.patterns.creational.factory.abstractfactory.indegredients.sauce.Sauce;
import main.java.com.patterns.creational.factory.abstractfactory.indegredients.veggies.Veggies;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Pepperoni  pepperoni;
    Clams clams;
    Veggies[] veggies;
    abstract void prepare();
    void bake() {
        System.out.println("Baking");

    }
    void setName(String name){
        this.name = name;
    }
    void cut() {
        System.out.println("Cutting");
    }
    void box() {
        System.out.println("Boxing");
    }
    public String getName(){
        return name;
    }
    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", clams=" + clams +
                '}';
    }
}