package observer;

import java.util.ArrayList;
/**
 *   主题接口
 * @author Administrator
 *
 */
public interface Subject {
	// 添加监听对象
	public void registerObserver(Observer... observers);
	
	// 移除监听者
	public void removerObserver(Observer... observers) throws Exception;
	
	// 通知
	public void notifyObservers();
}
