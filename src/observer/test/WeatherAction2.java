package observer.test;

import observer.Action;
import observer.Subject;
import observer.SubjectData;

public class WeatherAction2 implements Action{

	@Override
	public void doAction(SubjectData subjectData) {
		System.out.println("action-2:" + ((WeatherData)subjectData).getPressure());
		
	}
}
