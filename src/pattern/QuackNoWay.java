package pattern;

/**
 * Created by Rashid on 2015-02-11.
 */
public class QuackNoWay implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Can not Quack!");
    }
}
