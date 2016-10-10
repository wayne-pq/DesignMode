package designmode.装饰模式;


/**
 * Source 类是被装饰类
 * @author panqian
 *
 */
public class Source implements Sourceable {

	@Override
	public void method() {
		System.out.println("the original method!");
	}


}
