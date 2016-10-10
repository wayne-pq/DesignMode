package designmode.适配器模式.类的适配器模式;

/**
 * 类的适配器模式
 * 
 * 这样 Targetable 接口的实现类就具有了 Source 类的功能。
 * @author panqian
 *
 */
public class AdapterTest {

	public static void main(String[] args) {
		Targetable targetable = new Adapter();
		targetable.method1();
		targetable.method2();
	}

}