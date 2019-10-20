package decorator.starbuzzWithSizes;

/**
 * ����ĳ�����,���еĻ���Ҫ�̳������
 * @author Administrator
 *
 */
public abstract class Beverage {
	// ���Ӵ�С��ö����
	public enum Size { TALL, GRANDE, VENTI };
	Size size = Size.TALL;
	String description = "Unknown Beverage";
  
	public String getDescription() {
		return description;
	}
	
	// ��̬���ñ��Ӵ�С
	public void setSize(Size size) {
		this.size = size;
	}
	
	public Size getSize() {
		return this.size;
	}
 
	public abstract double cost();
}
