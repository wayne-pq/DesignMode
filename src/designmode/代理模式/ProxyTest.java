package designmode.代理模式;

/**
 * 代理模式  跟 装饰者模式很像，但是区别是：
 * 当使用代理模式的时候，我们常常在一个代理类中创建一个对象的实例;当我们使用装饰器模 式的时候，我们通常的做法是将原始对象作为一个参数传给装饰者的构造器。
 * @author panqian
 *
 */
public class ProxyTest {
	public static void main(String[] args) {
        Source source = new Source();
        Sourceable sourceable = new Proxy(source);
        sourceable.method();
	}
}
