package main.java.com.patterns.creational.factory.abstractfactory;

public class CheesePizza extends Pizza{
    PizzaIngredientFamily ingredientFamily;
    public CheesePizza(PizzaIngredientFamily ingredientFamily){
        this.ingredientFamily = ingredientFamily;
    }
    @Override
    void prepare() {
        System.out.println("Preparing "+name);
        dough = ingredientFamily.createDough();
        sauce = ingredientFamily.createSauce();
        cheese = ingredientFamily.createCheese();

    }
}
