package FactoryMethodPattern.Creator;

import FactoryMethodPattern.Product.*;

/**
 * Created by klieart on 9/24/15.
 */
public abstract class PizzaStore {

    // NOTE: this is a FACTORY METHOD! Subclasses override & implement this.
    // Method responsible for instantiation of dependent Pizza object
    abstract Pizza createPizza( String type );

    // Method responsible for executing actions against Pizza object
    public Pizza orderPizza( String type ) {
        Pizza pizza;

        // Encapsulate object creation
        pizza = createPizza( type );

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    // Other methods here...

}


