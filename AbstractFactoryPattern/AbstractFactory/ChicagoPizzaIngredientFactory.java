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
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() { return new ThickCrustDough(); }
    public Sauce createSauce() { return new PlumTomatoSauce(); }
    public Cheese createCheese() { return new MozarellaCheese(); }
    public Clams createClams() { return new FrozenClams(); }
    public Veggies[] createVeggies() { return new Veggies[] { new Garlic(), new Onion(), new Mushroom(), new RedPepper() }; }
    public Pepperoni createPepperoni() { return new SlicedPepperoni(); }

}
