package designmode.观察者模式;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractSubject implements Subject {

	private List<Observer> list = new ArrayList<Observer>();
	@Override
	public void add(Observer observer) {
		list.add(observer);
	}

	@Override
	public void del(Observer observer) {
		list.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for(Observer observer : list)
			observer.update();
	}
}