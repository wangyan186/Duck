package model;

//子类构造器
public class RubberDuck extends Duck {
	public RubberDuck() {
	  quackBehavior = new MuteQuack();
      flyBehavior = new FlyNoWay();
	}
}
