package DecoratorPattern;

/**
 * Created by klieart on 3/5/15.
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
