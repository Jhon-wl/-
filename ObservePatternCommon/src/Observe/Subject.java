package Observe;

import java.util.ArrayList;
import java.util.List;

/*
 * Ŀ�������֪���۲����Ĺ۲��ߣ����ṩ��Ӻ�ɾ���۲��ߵĽӿ�
 * */
public class Subject {
	//����ע��Ĺ۲����б�
	private List<Observer> observers = new ArrayList<Observer>();
	//����attach dettch notifyObservers����
	
	//��ӹ۲���
	public void attach(Observer observer){
		observers.add(observer);
	}
	//ɾ���۲���
	public void dettch(Observer observer) {
		observers.remove(observer);
	}
	//����֪ͨ����
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(this);
		}
	}
}
