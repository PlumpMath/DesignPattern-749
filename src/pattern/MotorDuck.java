package pattern;

/**
 * Created by Rashid on 2015-02-11.
 */
public class MotorDuck extends Duck {
    public MotorDuck(){
        quackBehavior = new QuackNoWay();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("I am a motor duck!");
    }
}
