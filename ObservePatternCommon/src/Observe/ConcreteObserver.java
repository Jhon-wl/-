package Observe;
/*
 * ����Ĺ۲��߶���ʵ�ָ��·�����ʹ�����״̬��Ŀ���״̬����һ��
 * */
public class ConcreteObserver implements Observer {
	//����һ���۲��ߵ�״̬
	private String ObserverState;
	@Override
	public void update(Subject subject) {
		ObserverState = ((ConcreteSubject)subject).getSubjectState();
		
	}

}
