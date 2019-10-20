package strategy.impl;

import strategy.FlyBehavior;

/**
 * 飞行动作的一个实现
 * @author Administrator
 *
 */
public class FlyFastly implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("Fly falstly...");	
	}
}
