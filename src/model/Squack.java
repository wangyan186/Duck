package model;

//叫声接口的implement类--吱
public class Squack implements QuackBehavior {
	@Override
	public void quack() {
		System.out.println("吱---");
	}

}
