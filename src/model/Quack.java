package model;

//叫声接口的implement类--呱
public class Quack implements QuackBehavior{
	@Override
	public void quack() {
		System.out.println("呱---");
       }
}
