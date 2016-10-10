package designmode.适配器模式.类的适配器模式;

/**
 * 通过 Adapter 类，将 Source 的功能扩展到 Targetable 里
 * @author panqian
 *
 */
public class Adapter extends Source implements Targetable {

	@Override
	public void method2() {
		System.out.println("this is the targetable method!");
	}

}