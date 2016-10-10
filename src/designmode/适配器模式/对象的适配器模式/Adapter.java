package designmode.适配器模式.对象的适配器模式;


/**
 * 这次相对于"类的适配器模式" 不继承 Source 类，而是持有 Source 类的实例，以达到解决兼容性的问题。
 * 通过 Adapter 类，将 Source 的功能扩展到 Targetable 里
 * 
 * @author panqian
 *
 */
public class Adapter implements Targetable {

	private Source source;

	public Adapter(Source source) {
		super();
		this.source = source;
	}

	@Override
	public void method2() {
		System.out.println("this is the targetable method!");
	}

	@Override
	public void method1() {
		source.method1();
	}

}