package observer;

import java.util.ArrayList;
/**
 *   ����ӿ�
 * @author Administrator
 *
 */
public interface Subject {
	// ��Ӽ�������
	public void registerObserver(Observer... observers);
	
	// �Ƴ�������
	public void removerObserver(Observer... observers) throws Exception;
	
	// ֪ͨ
	public void notifyObservers();
}
