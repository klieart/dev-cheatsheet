package AbstractFactoryPattern.AbstractFactory;

import AbstractFactoryPattern.ProductFamily.CheeseFamily.*;
import AbstractFactoryPattern.ProductFamily.DoughFamily.*;
import AbstractFactoryPattern.ProductFamily.ClamsFamily.*;
import AbstractFactoryPattern.ProductFamily.SauceFamily.*;
import AbstractFactoryPattern.ProductFamily.PepperoniFamily.*;
import AbstractFactoryPattern.ProductFamily.VeggiesFamily.*;

/**
 * Created by klieart on 9/24/15.
 */
public interface PizzaIngredientFactory {
    public Dough createDough();
    public Clams createClams();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
}
