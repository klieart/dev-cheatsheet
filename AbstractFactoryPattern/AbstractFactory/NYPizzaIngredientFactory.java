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
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() { return new ThinCrustDough(); }
    public Sauce createSauce() { return new MarinaraSauce(); }
    public Cheese createCheese() { return new ReggianoCheese(); }
    public Clams createClams() { return new FreshClams(); }
    public Veggies[] createVeggies() { return new Veggies[] { new Garlic(), new Onion(), new Mushroom(), new RedPepper() }; }
    public Pepperoni createPepperoni() { return new SlicedPepperoni(); }
}
