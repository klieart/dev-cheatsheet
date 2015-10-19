package FactoryMethodPattern.Creator;

import AbstractFactoryPattern.AbstractFactory.*;
import FactoryMethodPattern.Product.*;

/**
 * Created by klieart on 9/24/15.
 */
public class ChicagoPizzaStore extends PizzaStore {

    // Implementation of factory method for Chicago Style Pizzas; overrides default from PizzaStore
    Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        if (type.equals("cheese")) {
            // To get "square slices" from CheesePizza with clean OOD, I may need to:
            // 1) Overload the constructor for Pizza to take in no params or a factory object param, and then
            // 2) implement the decorator pattern and chain the prepare, bake, cut, and box actions for a Pizza object.
            pizza = new ChicagoStyleCheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Chicago Style Veggie Pizza");
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago Style Clam Pizza");
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Chicago Style Pepperoni Pizza");
        }
        return pizza;
    }
}
