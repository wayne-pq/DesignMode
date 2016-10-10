package designmode.观察者模式;
/**
 * 当一个对象变化时，其它依赖该对象的对象都会收到通知，并且随着变化！
 * @author panqian
 *
 */
public class ObserverTest {

	public static void main(String[] args) {
		Subject sub = new MySubject();
		sub.add(new Observer1());
		sub.add(new Observer2());
		
		sub.operation();
	}

}