package main.java.com.patterns.creational.factory.abstractfactory;

public class VeggiePizza extends Pizza {
    PizzaIngredientFamily ingredientFamily;
    public VeggiePizza(PizzaIngredientFamily ingredientFamily){
        this.ingredientFamily = ingredientFamily;
    }
    @Override
    void prepare() {
        System.out.println("Preparing "+name);
        dough = ingredientFamily.createDough();
        sauce = ingredientFamily.createSauce();
        cheese = ingredientFamily.createCheese();
        veggies = ingredientFamily.createVeggies();
    }
}
