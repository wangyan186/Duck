package model;

//���๹����
public class RedheadDuck extends Duck {

	public RedheadDuck() {
		quackBehavior = new Squack();
		flyBehavior = new FlyWithRocket();
	}
}
