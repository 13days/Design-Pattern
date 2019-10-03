package observer.impl;

import java.util.ArrayList;

import observer.Observer;
import observer.Subject;
import observer.SubjectData;

/**
 * �����ͨ��ʵ��
 * @author Administrator
 *
 */
public class SubjectImpl implements Subject{
	
	// ���Ķ���
	private ArrayList<ObserverImpl> observerList = new ArrayList<ObserverImpl>();
	
	// ���������ݶ���
	private SubjectData subjectData;
	
	// ����Դ
	public SubjectImpl(SubjectData subjectData) {
		this.subjectData=subjectData;
	}
	
	// ��Ӽ�������
	@Override
	public void registerObserver(Observer... observers) {
		for(Observer observer : observers) {
			observerList.add((ObserverImpl)observer);
		}
	};
	
	// �Ƴ�������
	@Override
	public void removerObserver(Observer... observers) throws Exception {
		for(Observer observer : observers) {
			if(!observerList.contains(observer)) {
				throw new Exception("can remover observer :["+observer+"]");
			}
		}
		for(Observer observer : observers) {
			observerList.remove(observer);
		}
	}
	
	// ֪ͨ
	@Override
	public void notifyObservers() {
		for(ObserverImpl observer : observerList) {
			observer.setChanged(true);
			if(observer.getIsListening()) {
				observer.update();
			}
		}
	}
	
	
	// ����Դ�����ı�Ľӿڷ���
	// �����޸�Ϊ����,��̬�޸�(���ⲿ��������޸�...)
	// change(Interface interface){ this.data = interface.change(Data data); }
	// weatherData->{data.setxxx();}
	
	// �����޸Ķ������ⲿ 
	public void change(Change change) {
		change.doChange(subjectData); // �ص���������ʵ��
		notifyObservers();
	}
	
	// ��¶���۲��ߵ�����Դ
	public SubjectData getSubjectData() {
		return subjectData;
	}
	// ����ı�Ķ���,����ʵ�ֽ����������
	public interface Change{
		public void doChange(SubjectData subjectData);
	}
}
