package observer.test;

import observer.SubjectData;
import observer.impl.ObserverImpl;
import observer.impl.SubjectImpl;
import observer.impl.SubjectImpl.Change;

public class Main {
	public static void main(String[] args) throws Exception {
		
		// 主题对象
		// 创建发布者和配置数据源(数据源无法动态更换,保证对收听方负责)
		SubjectImpl weather = new SubjectImpl(new WeatherData());
		
		// 观察者,创建的时候就指定数据源
		ObserverImpl weatherLisener1 = new ObserverImpl(weather);
		ObserverImpl weatherLisener2 = new ObserverImpl(weather);
		
		// 观察者的动作类型
		WeatherAction1 action1 = new WeatherAction1();
		WeatherAction2 action2 = new WeatherAction2();
		WeatherAction3 action3 = new WeatherAction3();
		
		// 观察者1的监听动作
		weatherLisener1.addAction(action1, action2);
		
		// 观察者2设置不实时监听
		weatherLisener2.setListening(false); 
		
		// 下拉动作
		WeatherPull pull = new  WeatherPull();
		
		// 观察者2设置下拉动作
		weatherLisener2.setPullAction(pull);
		weatherLisener2.pull();
		
		// 主题执行一次修改动作
		weather.change(new Change() {
			@Override
			public void doChange(SubjectData subjectData) {
				// 必须主动转型为构造时设置的对象,这个比较low
				// 可以考虑在构造方法传入数据对象时传入类类型,之后在impl里动态装换
				((WeatherData)subjectData).setLocalWeatherData(1, 2, 3);
			}
		});
		weatherLisener2.pull(); // 改变了,拉到了
		weatherLisener2.pull(); // 没改变拉不到
		
		weatherLisener1.removeAction(action1);
		
		weatherLisener2.setListening(true); // 设置实时监听
		weatherLisener2.addAction(action3);
		// 主题执行一次修改动作
		weather.change(new Change() {
			@Override
			public void doChange(SubjectData subjectData) {
				// 必须主动转型为构造时设置的对象,这个比较low
				// 可以考虑在构造方法传入数据对象时传入类类型,之后在impl里动态装换
				((WeatherData)subjectData).setLocalWeatherData(3, 4, 5);
			}
		});
		weatherLisener2.pull();
	}
}
