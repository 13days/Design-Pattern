package strategy.impl;

import strategy.FlyBehavior;

/**
 * ���ж�����һ��ʵ��
 * @author Administrator
 *
 */
public class FlyFastly implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("Fly falstly...");	
	}
}
