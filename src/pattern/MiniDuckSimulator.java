package pattern;

public class MiniDuckSimulator {

    public static void main(String[] args) {
	// write your code here
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

        Duck motor = new MotorDuck();
        motor.performQuack();
        motor.setQuackBehavior(new QuackMotorPowered());
        motor.performQuack();
        }
    }
