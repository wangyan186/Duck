package test;

import model.Duck;
import model.MallardDuck;
import model.RedheadDuck;
import model.RubberDuck;


public class DuckTest {
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		System.out.println("��ͷѼ------");
		mallard.performFly();
		mallard.performQuack();


		
		Duck redhead = new RedheadDuck();
		System.out.println("��ͷѼ------");
		redhead.performFly();
		redhead.performQuack();
		
		
		Duck rubber = new RubberDuck();
		System.out.println("��ƤѼ------");
		rubber.performFly();
		rubber.performQuack();
	}
}
