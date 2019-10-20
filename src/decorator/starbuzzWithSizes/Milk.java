package decorator.starbuzzWithSizes;

/**
 * װ���ߵľ���ʵ��
 * @author Administrator
 *
 */
public class Milk extends CondimentDecorator {
	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	// �ݹ���ñ�װ�εĻ���(Ҳ�����Ǳ�װ�ι��Ļ���)
	public String getDescription() {
		return beverage.getDescription() + ", Milk";
	}

	public double cost() {
		return beverage.cost() + .10;
	}
}
