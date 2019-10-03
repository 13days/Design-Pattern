package observer.impl;

import java.util.ArrayList;

import observer.Observer;
import observer.Subject;
import observer.SubjectData;

/**
 * 主题的通用实现
 * @author Administrator
 *
 */
public class SubjectImpl implements Subject{
	
	// 订阅对象
	private ArrayList<ObserverImpl> observerList = new ArrayList<ObserverImpl>();
	
	// 监听的数据对象
	private SubjectData subjectData;
	
	// 数据源
	public SubjectImpl(SubjectData subjectData) {
		this.subjectData=subjectData;
	}
	
	// 添加监听对象
	@Override
	public void registerObserver(Observer... observers) {
		for(Observer observer : observers) {
			observerList.add((ObserverImpl)observer);
		}
	};
	
	// 移除监听者
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
	
	// 通知
	@Override
	public void notifyObservers() {
		for(ObserverImpl observer : observerList) {
			observer.setChanged(true);
			if(observer.getIsListening()) {
				observer.update();
			}
		}
	}
	
	
	// 数据源发生改变的接口方法
	// 可以修改为对象,动态修改(在外部调用这个修改...)
	// change(Interface interface){ this.data = interface.change(Data data); }
	// weatherData->{data.setxxx();}
	
	// 主题修改动作的外部 
	public void change(Change change) {
		change.doChange(subjectData); // 回调主题对象的实现
		notifyObservers();
	}
	
	// 暴露给观察者的数据源
	public SubjectData getSubjectData() {
		return subjectData;
	}
	// 主题改变的动作,具体实现交给主题对象
	public interface Change{
		public void doChange(SubjectData subjectData);
	}
}
