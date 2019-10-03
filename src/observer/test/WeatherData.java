package observer.test;

import observer.SubjectData;

public class WeatherData implements SubjectData{
	// 监听的数据,可以修改为对象,动态绑定
	private float temperature;
	private float humidity;
	private float pressure;
	
	// 允许暴露的数据
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
	
	// 主题的更新
	public void setLocalWeatherData(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
	}
}
