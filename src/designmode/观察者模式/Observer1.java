package designmode.观察者模式;
public class Observer1 implements Observer {

	@Override
	public void update() {
		System.out.println("observer1 接受了更新!");
	}
}