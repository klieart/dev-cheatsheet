package DecoratorPattern;

/**
 * Created by klieart on 3/5/15.
 */
public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    public double cost() {
        return 0.10 + beverage.cost();
    }
}
