package observer.test;

import observer.SubjectData;

public class WeatherData implements SubjectData{
	// ����������,�����޸�Ϊ����,��̬��
	private float temperature;
	private float humidity;
	private float pressure;
	
	// ����¶������
	public float getTemperature() {
		return temperature;
	}
	public float getHumidity() {
		return humidity;
	}
	public float getPressure() {
		return pressure;
	}
	public String getData() {
		return"[" + this.temperature + ","+ this.humidity + "," + this.pressure + "]";
	}
	
	// ����ĸ���
	public void setLocalWeatherData(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
	}
}
