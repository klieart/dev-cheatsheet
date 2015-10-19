package FactoryMethodPattern.Product;

import AbstractFactoryPattern.AbstractFactory.PizzaIngredientFactory;
import AbstractFactoryPattern.ProductFamily.CheeseFamily.*;
import AbstractFactoryPattern.ProductFamily.DoughFamily.*;
import AbstractFactoryPattern.ProductFamily.ClamsFamily.*;
import AbstractFactoryPattern.ProductFamily.SauceFamily.*;
import AbstractFactoryPattern.ProductFamily.PepperoniFamily.*;
import AbstractFactoryPattern.ProductFamily.VeggiesFamily.*;

import java.util.ArrayList;

/**
 * Created by klieart on 9/24/15.
 */
public abstract class Pizza {
    String name;

    PizzaIngredientFactory ingredientFactory;
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Clams clams;
    Veggies veggies[];
    Pepperoni pepperoni;

    public abstract void prepare();

    public void bake(){ System.out.println( "Bake for 25 min at 350 deg F." ); }
    public void cut(){ System.out.println( "Cutting the pizza into diagonal slices." ); }
    public void box(){ System.out.println( "Place pizza in official PizzaStore box." ); }

    public void setName(String name){ this.name = name; }
    public String getName(){ return name; }



    public String toString() {
        /*
        System.out.println( "Preparing " + name );
        System.out.println( "Tossing dough..." );
        System.out.println( "Adding sauce..." );
        System.out.println( "Adding toppings: " );
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println( "  " + toppings.get(i) );
        }*/
        return null;
    }
}
