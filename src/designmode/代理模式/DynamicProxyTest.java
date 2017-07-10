package designmode.代理模式;

import java.lang.reflect.Proxy;

/**
 * @author panqian
 */
public class DynamicProxyTest {
    public static void main(String[] args) {
        Sourceable source = new Source();

        DynamicProxy dynamicProxy = new DynamicProxy(source);
        Sourceable sourceable = (Sourceable) Proxy.newProxyInstance(Source.class.getClassLoader(), Source.class.getInterfaces(), dynamicProxy);

        sourceable.method();
        System.out.println("=========");
        sourceable.method1();
    }
}
