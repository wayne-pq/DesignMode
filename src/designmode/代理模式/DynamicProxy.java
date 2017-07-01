package designmode.代理模式;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理，不用自己实现 被代理类
 * Created by panqian on 2017/7/1.
 */
public class DynamicProxy implements InvocationHandler {

    Object object;

    DynamicProxy(Object object) {
        super();
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before dynamicProxy!");
        method.invoke(object, args);
        System.out.println("before dynamicProxy!");
        return null;
    }
}
