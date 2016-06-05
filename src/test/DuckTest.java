package test;

import model.Duck;
import model.MallardDuck;
import model.RedheadDuck;
import model.RubberDuck;


public class DuckTest {
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		System.out.println("ÂÌÍ·Ñ¼------");
		mallard.performFly();
		mallard.performQuack();


		
		Duck redhead = new RedheadDuck();
		System.out.println("ºìÍ·Ñ¼------");
		redhead.performFly();
		redhead.performQuack();
		
		
		Duck rubber = new RubberDuck();
		System.out.println("ÏðÆ¤Ñ¼------");
		rubber.performFly();
		rubber.performQuack();
	}
}
