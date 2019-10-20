package decorator.starbuzzWithSizes;

/**
 * 装饰者基类,所有的装饰者要继承这个类,而装饰者又继承基类
 * @author Administrator
 *
 */
public abstract class CondimentDecorator extends Beverage {
	public Beverage beverage;
	public abstract String getDescription();
	
	public Size getSize() {
		return beverage.getSize();
	}
}
