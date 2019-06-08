package strategy_pattern;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        System.out.println("\n** Mallard Duck **:");
        Duck mallard = new MallardDuck();
        // calls the MallardDuck's inherited performQuack(), which then delegates to the object's QuackBehavior
        // (i.e., calls quack() on the duck's inherited quackBehavior reference)
        mallard.performQuack();
        mallard.performFly();   // do the same with MallardDucks's inherited performFly() method

        System.out.println("\n** Model Duck **:");
        Duck model = new ModelDuck();
        model.performFly(); // outputs 'I can't fly'
        model.setFlyBehavior(new FlyRocketPowered()); // invokes the setter method to change fly behavior at runtime! yay!
        model.performFly(); // model duck dynamically changed its flying behavior
    }
}
