package decorator.starbuzzWithSizes;


/**
 * װ���ߵľ���ʵ��
 * @author Administrator
 *
 */
public class Mocha extends CondimentDecorator {
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
 
	// �ݹ���ñ�װ�εĻ���(Ҳ�����Ǳ�װ�ι��Ļ���)
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}
 
	public double cost() {
		return beverage.cost() + .20;
	}
}
