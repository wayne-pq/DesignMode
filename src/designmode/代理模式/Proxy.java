package designmode.代理模式;

/**
 * Proxy 是一个代理类
 * @author panqian
 *
 */
public class Proxy implements Sourceable {
	
	public Source source;
	
	public Proxy() {
		super();
		this.source = new Source();
	}

	@Override
	public void method() {
		System.out.println("before proxy!");
		source.method();
		System.out.println("after proxy!");
	}

}
