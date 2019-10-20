package strategy.test;

import strategy.impl.CanQuack;
import strategy.impl.FlyFastly;
import strategy.impl.ModelDuck;

/**
 * 测试鸭子模拟器
 * @author Administrator
 *
 */
public class Main {
	public static void main(String[] args) {
		ModelDuck model = new ModelDuck();
		
		// 飞行
		model.performFly();
		// 叫
		model.performQuack();
		
		// 动态设置行为
		model.setFlyBehavior(new FlyFastly());
		model.setQuackBehavior(new CanQuack());
		
		model.performQuack();
		model.performFly();
	}
}
