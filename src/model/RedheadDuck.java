package model;

//子类构造器
public class RedheadDuck extends Duck {

	public RedheadDuck() {
		quackBehavior = new Squack();
		flyBehavior = new FlyWithRocket();
	}
}
