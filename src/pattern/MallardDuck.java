package pattern;

/**
 * Created by Rashid on 2015-02-10.
 */
public class MallardDuck extends Duck {
    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    @Override
    public void display() {

    }
}
