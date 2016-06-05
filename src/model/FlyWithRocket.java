package model;
 
//飞行接口的implement类--喷射
public class FlyWithRocket implements FlyBehavior{
	@Override
	public void fly() {
		System.out.println("喷射飞");
	}
}
