package observer.test;

import observer.Action;
import observer.Subject;
import observer.SubjectData;
/**
 *   ��������
 * @author Administrator
 *
 */
public class WeatherAction1 implements Action{
	@Override
	public void doAction(SubjectData subjectData) {
		System.out.println("action-1:" + ((WeatherData)subjectData).getTemperature());
		
	}
}
