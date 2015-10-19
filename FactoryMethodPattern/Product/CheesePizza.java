package FactoryMethodPattern.Product;

import AbstractFactoryPattern.AbstractFactory.PizzaIngredientFactory;

/**
 * Created by klieart on 9/24/15.
 */
public class CheesePizza extends Pizza {

    // NOTE: CheesePizza is a client that always instantiates an ABSTRACT FACTORY when CheesePizza is created!
    // Method responsible for instantiation of dependent Pizza object
    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    // Preparation steps specific to a Cheese Pizza
    public void prepare() {
        System.out.println( "Preparing " + name );
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
