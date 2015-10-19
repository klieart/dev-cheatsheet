package FactoryMethodPattern.Product;

import AbstractFactoryPattern.AbstractFactory.PizzaIngredientFactory;

/**
 * Created by klieart on 9/24/15.
 */
public class VeggiePizza extends Pizza {

    public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
        System.out.println( "Preparing " + name );
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        veggies = ingredientFactory.createVeggies();
    }
}
