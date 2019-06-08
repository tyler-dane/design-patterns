package strategy_pattern;

public class MallardDuck extends Duck {

    // uses the Quack class to handle its quack, so when performQuack() is called, the responsbility for the quack
    // is delegated to the Quack object and we get a real quack
    public MallardDuck() {
        quackBehavior = new Quack();    // inherits quackBehavior from Duck
        flyBehavior = new FlyWithWings();   // inherits flyBehavior from Duck
    }

    public void display() {
        System.out.println("I'm a Mallard duck");
    }
}
