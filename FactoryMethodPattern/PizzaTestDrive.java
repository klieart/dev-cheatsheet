package FactoryMethodPattern;

import FactoryMethodPattern.Creator.*;
import FactoryMethodPattern.Product.Pizza;

/**
 * Created by klieart on 9/24/15.
 */
public class PizzaTestDrive {
    public static void main( String[] args ) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = null;

        pizza = nyStore.orderPizza("cheese");
        System.out.println( "Ethan ordered a " + pizza.getName() + "\n" );

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println( "Joel ordered a " + pizza.getName() + "\n" );
    }
}
