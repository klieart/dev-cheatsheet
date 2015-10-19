package FactoryMethodPattern.Product;

import AbstractFactoryPattern.AbstractFactory.PizzaIngredientFactory;

/**
 * Created by klieart on 9/24/15.
 */
public class PepperoniPizza extends Pizza {

    public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
        System.out.println( "Preparing " + name );
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        pepperoni = ingredientFactory.createPepperoni();
    }
}
