package StrategyPattern;

/**
 * Created by klieart on 3/3/15.
 */
public class MallardDuck extends Duck {


    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    public void display(){
        System.out.println("I'm a real Mallard duck");
    }
}
