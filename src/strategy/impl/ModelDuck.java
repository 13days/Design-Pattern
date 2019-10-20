package strategy.impl;

import strategy.Duck;

/**
 * Ѽ��ģ����
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
