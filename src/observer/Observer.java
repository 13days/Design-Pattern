package observer;

import java.util.ArrayList;
import java.util.List;
/**
 * 观察者接口
 * @author Administrator
 *
 */
public interface Observer {	
	// 动态添加观察者响应事件
	public void addAction(Action... actions);
	
	// 动态移除观察者响应事件
	public void removeAction(Action... actions) throws Exception;
	
	// 可以主动拉取数据,做出响应
	public void pull(); 
	
	// 主题发布时的相应
	public void update();
}
