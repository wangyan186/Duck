package model;

//���๹����
public class RubberDuck extends Duck {
	public RubberDuck() {
	  quackBehavior = new MuteQuack();
      flyBehavior = new FlyNoWay();
	}
}
