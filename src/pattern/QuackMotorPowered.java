package pattern;

/**
 * Created by Rashid on 2015-02-11.
 */
public class QuackMotorPowered implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I quack using my motor!");
    }
}
