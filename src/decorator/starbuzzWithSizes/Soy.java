package decorator.starbuzzWithSizes;

/**
 * 装饰者的一个具体实现
 * @author Administrator
 *
 */
public class Soy extends CondimentDecorator {
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	// 递归调用被装饰的基类(也可能是被装饰过的基类)
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	// 递归调用,根据杯子大小决定价格
	public double cost() {
		double cost = beverage.cost();
		if (beverage.getSize() == Size.TALL) {
			cost += .10;
		} else if (beverage.getSize() == Size.GRANDE) {
			cost += .15;
		} else if (beverage.getSize() == Size.VENTI) {
			cost += .20;
		}
		return cost;
	}
}
