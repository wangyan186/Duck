package model;

//叫声接口的implement类--不会叫
public class MuteQuack implements QuackBehavior{
	@Override  
	public void quack(){
  		System.out.println("不会叫--");
      }
}
