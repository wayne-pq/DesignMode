package designmode.适配器模式.接口的适配器模式;

/**
 * 类的适配器模式
 * 
 * 这样 Targetable 接口的实现类就具有了 Source 类的功能。
 * 
 * @author panqian
 *
 */
public class WrapperTest {

	/**
	 * 当不希望实现一个接口中所有的方法时，可以创建一个抽象类 Wrapper，实现所有方法，我们写别的类的时候，继承抽象类即可。
	 * @param args
	 */
	public static void main(String[] args) {
		Sourceable source1 = new SourceSub1();
		Sourceable source2 = new SourceSub2();
		source1.method1();
		source1.method2();
		source2.method1();
		source2.method2();
	}

}