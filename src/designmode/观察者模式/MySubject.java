package designmode.观察者模式;
public class MySubject extends AbstractSubject {

	@Override
	public void operation() {
		System.out.println("文章更新了!");
		notifyObservers();
	}

}