package decorator.starbuzzWithSizes;

/**
 * װ���ߵ�һ������ʵ��
 * @author Administrator
 *
 */
public class Soy extends CondimentDecorator {
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	// �ݹ���ñ�װ�εĻ���(Ҳ�����Ǳ�װ�ι��Ļ���)
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	// �ݹ����,���ݱ��Ӵ�С�����۸�
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
