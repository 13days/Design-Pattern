package decorator.starbuzzWithSizes;


/**
 * 基类的具体实现
 * @author Administrator
 *
 */
public class HouseBlend extends Beverage {
	public HouseBlend() {
		description = "House Blend Coffee";
	}
 
	public double cost() {
		return .89;
	}
}

