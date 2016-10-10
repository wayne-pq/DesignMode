package designmode.装饰模式;

/**
 * Decorator 类是一个装饰类
 * @author panqian
 *
 */
public class Decorator implements Sourceable {
	
	public Sourceable sourceable;
	
	public Decorator(Sourceable sourceable) {
		super();
		this.sourceable = sourceable;
	}

	@Override
	public void method() {
		System.out.println("before decorator!");
		sourceable.method();
		System.out.println("after decorator!");
	}

}
