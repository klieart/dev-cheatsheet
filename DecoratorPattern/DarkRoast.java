package DecoratorPattern;

/**
 * Created by klieart on 3/5/15.
 */
public class DarkRoast extends Beverage {

    public DarkRoast() { description = "Dark Roast Coffee"; }

    public double cost() { return 0.99; }
}
