package designmode.代理模式.evolution01;


import designmode.代理模式.Source;
import designmode.代理模式.Sourceable;

import java.lang.reflect.Proxy;

/**
 * 独立拦截逻辑
 *
 * @author panqian
 */
public class DynamicProxyTest {
    public static void main(String[] args) {
        Sourceable source = new Source();

        //lambda表达式直接实现,返回 [0,9] 之间的数
        Interceptor interceptor = () -> new Double(Math.random() * 10).intValue();

        DynamicProxy dynamicProxy = new DynamicProxy(source, interceptor);
        Sourceable sourceable = (Sourceable) Proxy.newProxyInstance(Source.class.getClassLoader(), Source.class.getInterfaces(), dynamicProxy);

        sourceable.method();
        System.out.println("=========");
        sourceable.method1();
    }
}
