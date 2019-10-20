package strategy.impl;

import strategy.QuackBehavior;

public class CanQuack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("Can quack...");
	}

}
