package designmode.代理模式.evolution01;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理，新增Interceptor接口，让拦截逻辑分离出来
 * Created by panqian on 2017/7/31.
 */
public class DynamicProxy implements InvocationHandler {

    Interceptor interceptor;

    DynamicProxy(Object object, Interceptor interceptor) {
        super();
        this.interceptor = interceptor;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object intercept = interceptor.intercept();
        System.out.println("我收到了：" + intercept);
        return intercept;
    }
}
