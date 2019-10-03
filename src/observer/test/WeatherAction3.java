package observer.test;

import observer.Action;
import observer.Subject;
import observer.SubjectData;

public class WeatherAction3 implements Action{

	@Override
	public void doAction(SubjectData subjectData) {
		System.out.println("action-3:" + ((WeatherData)subjectData).getHumidity());
		
	}
}
