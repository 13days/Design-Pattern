package decorator.starbuzzWithSizes;

/**
 * 装饰者的具体实现
 * @author Administrator
 *
 */
public class Milk extends CondimentDecorator {
	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	// 递归调用被装饰的基类(也可能是被装饰过的基类)
	public String getDescription() {
		return beverage.getDescription() + ", Milk";
	}

	public double cost() {
		return beverage.cost() + .10;
	}
}
