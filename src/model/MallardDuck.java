package model;

//子类构造器
public class MallardDuck extends Duck {
	   public MallardDuck() {
	      quackBehavior = new Quack();
	      flyBehavior = new FlyWithWings();
	   }
	}
