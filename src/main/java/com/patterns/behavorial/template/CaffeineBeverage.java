package main.java.com.patterns.behavorial.template;

public abstract class CaffeineBeverage {
    public void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments()){
            addCondiments();
        }
    }

    void boilWater(){
        System.out.println("Boiling Water");
    }

    protected void pourInCup(){
        System.out.println("Pouring in Cup");
    }

    abstract void brew();

    abstract  void addCondiments();
    boolean customerWantsCondiments(){
        return true;
    }

}
