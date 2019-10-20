package decorator.starbuzzWithSizes;

/**
 * 基类的抽象类,所有的基类要继承这个类
 * @author Administrator
 *
 */
public abstract class Beverage {
	// 被子大小的枚举类
	public enum Size { TALL, GRANDE, VENTI };
	Size size = Size.TALL;
	String description = "Unknown Beverage";
  
	public String getDescription() {
		return description;
	}
	
	// 动态设置杯子大小
	public void setSize(Size size) {
		this.size = size;
	}
	
	public Size getSize() {
		return this.size;
	}
 
	public abstract double cost();
}
