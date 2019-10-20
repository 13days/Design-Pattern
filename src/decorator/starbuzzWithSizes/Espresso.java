package decorator.starbuzzWithSizes;

/**
 * 基类的一个具体实现
 * @author Administrator
 *
 */
public class Espresso extends Beverage {
  
	public Espresso() {
		description = "Espresso";
	}
  
	public double cost() {
		return 1.99;
	}
}

