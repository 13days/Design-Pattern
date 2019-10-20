package decorator.starbuzzWithSizes;


/**
 * 装饰者的具体实现
 * @author Administrator
 *
 */
public class Mocha extends CondimentDecorator {
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
 
	// 递归调用被装饰的基类(也可能是被装饰过的基类)
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}
 
	public double cost() {
		return beverage.cost() + .20;
	}
}
