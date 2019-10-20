package strategy.impl;

import strategy.QuackBehavior;

public class CanNotQuack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("Can not quack...");
	}

}
