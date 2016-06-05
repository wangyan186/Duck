package model;
 
//飞行接口的implement类--不会飞
public class FlyNoWay implements FlyBehavior{
	@Override
	public void fly() {
		System.out.println("不会飞");
	}
}
