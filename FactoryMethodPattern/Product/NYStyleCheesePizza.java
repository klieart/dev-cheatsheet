package FactoryMethodPattern.Product;

import AbstractFactoryPattern.AbstractFactory.PizzaIngredientFactory;

/**
 * Created by klieart on 9/24/15.
 */
public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza(PizzaIngredientFactory ingredientFactory) {
        name = "NY Style Sauce and Cheese Pizza.";
        //dough = "Thin Crust Dough";
        //sauce = "Marinara Sauce";
        //toppings.add( "Grated Reggiano Cheese" );
        this.ingredientFactory = ingredientFactory;
    }
    public void prepare() {
        System.out.println( "Preparing " + name );
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
