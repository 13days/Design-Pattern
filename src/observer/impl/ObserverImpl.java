package observer.impl;

import java.util.ArrayList;

import observer.Action;
import observer.Observer;
/**
 *  观察者的通用实现
 * @author Administrator
 *
 */
public class ObserverImpl implements Observer{
	private Action pullAction = null;
	private SubjectImpl subjectImpl;
	private boolean isListening = true;
	private boolean changed = false;
	
	// 绑定数据源
	public ObserverImpl(SubjectImpl subjectImpl) {
		this.subjectImpl = subjectImpl;
		// 添加数据源
		subjectImpl.registerObserver(this); 
	}
	
	// 相应事件列表
	private ArrayList<Action> actionList = new ArrayList<Action>();
	
	// 动态添加观察者响应事件
	@Override
	public void addAction(Action... actions) {
		for(Action action : actions) {
			actionList.add(action);
		}
	}
	
	// 动态移除观察者响应事件
	@Override
	public void removeAction(Action... actions) throws Exception {
		for(Action action : actions) {
			if(!actionList.contains(action)) {
				throw new Exception(this + " not exist action :" + action);
			}
		}
		for(Action action : actions) {
			actionList.remove(action);
		}
	}
	
	// 主动对数据源发起请求
	@Override
	public void pull() {
		if(pullAction!=null && this.getChanged()) {
			pullAction.doAction(subjectImpl.getSubjectData());
			this.setChanged(false);
		}
	}

	// 相应通知动作
	@Override
	public void update() {
		for(Action action : actionList) {
			action.doAction(subjectImpl.getSubjectData());
		}
	}

	// 动态设置运行时下拉动作
	public void setPullAction(Action pullAction) {
		this.pullAction = pullAction;
	}
	
	// 动态设置是否监听推送
	public void setListening(boolean isListening) {
		this.isListening = isListening;
	}
	
	// 获得是否监听数据源
	public boolean getIsListening() {
		return this.isListening;
	}
	
	// 监控的对象是否改变
	public void setChanged(boolean changed) {
		this.changed = changed;
	}

	public boolean getChanged() {
		return this.changed;
	}
}
