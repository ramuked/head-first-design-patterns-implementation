package main.java.com.patterns.creational.factory.abstractfactory;

public class NYPizzaStore extends PizzaStore{

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFamily pizzaIngredientFamily = new NYPizzaIngredientFamily();
        if(type.equals("cheese")){
            pizza =  new CheesePizza(pizzaIngredientFamily);
            pizza.setName("NY Style Cheese Pizza");
        }
        else if(type.equals("clams")){
            pizza = new ClamPizza(pizzaIngredientFamily);
            pizza.setName("NY Style Clam Pizza");

        }
        else if(type.equals("veggie")){
            pizza =  new VeggiePizza(pizzaIngredientFamily);
            pizza.setName("NY Style Veggie Pizza");

        }
        return pizza;
    }
}
