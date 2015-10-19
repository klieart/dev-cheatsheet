package FactoryMethodPattern.Product;

import AbstractFactoryPattern.AbstractFactory.PizzaIngredientFactory;

/**
 * Created by klieart on 9/24/15.
 */
public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza(PizzaIngredientFactory ingredientFactory) {
        name = "Chicago Style Deep Dish Cheese Pizza.";

        //dough = "Extra Thick Crust Dough";
        //sauce = "Plum Tomato Sauce";
        //toppings.add( "Shredded Mozzarella Cheese" );
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
        System.out.println( "Preparing " + name );
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }

    public void cut() {
        System.out.println( "Cutting the pizza into square slices" );
    }
}