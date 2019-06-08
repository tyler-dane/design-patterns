package strategy_pattern;

public abstract class Duck {

    // two reference variables for the behavior interface types
    // all duck subclasses (in same package) inherit these
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();  // delegate to the behavior class
    }

    public void performQuack() {
        quackBehavior.quack(); // delegate to behavior class
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    // can call setter methods anytime you want to change the behavior of a duck 'on the fly' (tehe)
    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
}
