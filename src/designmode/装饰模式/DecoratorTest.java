package designmode.装饰模式;

/**
 * 可以为 Source 类动态的添加一些功能
 * @author panqian
 *
 */
public class DecoratorTest {
	public static void main(String[] args) {
		Sourceable sourceable = new Source();
		Sourceable decorator = new Decorator(sourceable);
		
		decorator.method();
	}
}
