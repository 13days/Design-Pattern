package strategy.impl;

import strategy.FlyBehavior;

/**
 * ���ж�����һ��ʵ��
 * @author Administrator
 *
 */
public class FlySlowly implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("Fly solwly...");	
	}
}
