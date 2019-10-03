package observer.test;

import observer.SubjectData;
import observer.impl.ObserverImpl;
import observer.impl.SubjectImpl;
import observer.impl.SubjectImpl.Change;

public class Main {
	public static void main(String[] args) throws Exception {
		
		// �������
		// ���������ߺ���������Դ(����Դ�޷���̬����,��֤������������)
		SubjectImpl weather = new SubjectImpl(new WeatherData());
		
		// �۲���,������ʱ���ָ������Դ
		ObserverImpl weatherLisener1 = new ObserverImpl(weather);
		ObserverImpl weatherLisener2 = new ObserverImpl(weather);
		
		// �۲��ߵĶ�������
		WeatherAction1 action1 = new WeatherAction1();
		WeatherAction2 action2 = new WeatherAction2();
		WeatherAction3 action3 = new WeatherAction3();
		
		// �۲���1�ļ�������
		weatherLisener1.addAction(action1, action2);
		
		// �۲���2���ò�ʵʱ����
		weatherLisener2.setListening(false); 
		
		// ��������
		WeatherPull pull = new  WeatherPull();
		
		// �۲���2������������
		weatherLisener2.setPullAction(pull);
		weatherLisener2.pull();
		
		// ����ִ��һ���޸Ķ���
		weather.change(new Change() {
			@Override
			public void doChange(SubjectData subjectData) {
				// ��������ת��Ϊ����ʱ���õĶ���,����Ƚ�low
				// ���Կ����ڹ��췽���������ݶ���ʱ����������,֮����impl�ﶯ̬װ��
				((WeatherData)subjectData).setLocalWeatherData(1, 2, 3);
			}
		});
		weatherLisener2.pull(); // �ı���,������
		weatherLisener2.pull(); // û�ı�������
		
		weatherLisener1.removeAction(action1);
		
		weatherLisener2.setListening(true); // ����ʵʱ����
		weatherLisener2.addAction(action3);
		// ����ִ��һ���޸Ķ���
		weather.change(new Change() {
			@Override
			public void doChange(SubjectData subjectData) {
				// ��������ת��Ϊ����ʱ���õĶ���,����Ƚ�low
				// ���Կ����ڹ��췽���������ݶ���ʱ����������,֮����impl�ﶯ̬װ��
				((WeatherData)subjectData).setLocalWeatherData(3, 4, 5);
			}
		});
		weatherLisener2.pull();
	}
}
