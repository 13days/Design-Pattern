package strategy.impl;

import strategy.Duck;

/**
 * Ñ¼×ÓÄ£ÄâÆ÷
 * @author Administrator
 *
 */
public class ModelDuck extends Duck {
	public ModelDuck() {
		flyBehavior = new FlySlowly();
		quackBehavior =  new CanNotQuack();
	}

	public void display() {
		System.out.println("I'm a model duck");
	}
}
