package decorator.starbuzzWithSizes;

/**
 * װ���߻���,���е�װ����Ҫ�̳������,��װ�����ּ̳л���
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
