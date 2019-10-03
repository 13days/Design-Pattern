package observer.impl;

import java.util.ArrayList;

import observer.Action;
import observer.Observer;
/**
 *  �۲��ߵ�ͨ��ʵ��
 * @author Administrator
 *
 */
public class ObserverImpl implements Observer{
	private Action pullAction = null;
	private SubjectImpl subjectImpl;
	private boolean isListening = true;
	private boolean changed = false;
	
	// ������Դ
	public ObserverImpl(SubjectImpl subjectImpl) {
		this.subjectImpl = subjectImpl;
		// �������Դ
		subjectImpl.registerObserver(this); 
	}
	
	// ��Ӧ�¼��б�
	private ArrayList<Action> actionList = new ArrayList<Action>();
	
	// ��̬��ӹ۲�����Ӧ�¼�
	@Override
	public void addAction(Action... actions) {
		for(Action action : actions) {
			actionList.add(action);
		}
	}
	
	// ��̬�Ƴ��۲�����Ӧ�¼�
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
	
	// ����������Դ��������
	@Override
	public void pull() {
		if(pullAction!=null && this.getChanged()) {
			pullAction.doAction(subjectImpl.getSubjectData());
			this.setChanged(false);
		}
	}

	// ��Ӧ֪ͨ����
	@Override
	public void update() {
		for(Action action : actionList) {
			action.doAction(subjectImpl.getSubjectData());
		}
	}

	// ��̬��������ʱ��������
	public void setPullAction(Action pullAction) {
		this.pullAction = pullAction;
	}
	
	// ��̬�����Ƿ��������
	public void setListening(boolean isListening) {
		this.isListening = isListening;
	}
	
	// ����Ƿ��������Դ
	public boolean getIsListening() {
		return this.isListening;
	}
	
	// ��صĶ����Ƿ�ı�
	public void setChanged(boolean changed) {
		this.changed = changed;
	}

	public boolean getChanged() {
		return this.changed;
	}
}
