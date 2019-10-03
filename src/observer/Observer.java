package observer;

import java.util.ArrayList;
import java.util.List;
/**
 * �۲��߽ӿ�
 * @author Administrator
 *
 */
public interface Observer {	
	// ��̬��ӹ۲�����Ӧ�¼�
	public void addAction(Action... actions);
	
	// ��̬�Ƴ��۲�����Ӧ�¼�
	public void removeAction(Action... actions) throws Exception;
	
	// ����������ȡ����,������Ӧ
	public void pull(); 
	
	// ���ⷢ��ʱ����Ӧ
	public void update();
}
