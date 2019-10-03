package observer.test;

import observer.Action;
import observer.SubjectData;

public class WeatherPull implements Action {
	public void doAction(SubjectData subjectData) {
		System.out.println("Pull:" + ((WeatherData)subjectData).getData());
		
	}

}
