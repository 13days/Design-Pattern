package strategy.test;

import strategy.impl.CanQuack;
import strategy.impl.FlyFastly;
import strategy.impl.ModelDuck;

/**
 * ����Ѽ��ģ����
 * @author Administrator
 *
 */
public class Main {
	public static void main(String[] args) {
		ModelDuck model = new ModelDuck();
		
		// ����
		model.performFly();
		// ��
		model.performQuack();
		
		// ��̬������Ϊ
		model.setFlyBehavior(new FlyFastly());
		model.setQuackBehavior(new CanQuack());
		
		model.performQuack();
		model.performFly();
	}
}
