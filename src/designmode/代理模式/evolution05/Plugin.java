package designmode.代理模式.evolution05;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理，新增Interceptor接口，让拦截逻辑分离出来
 * Created by panqian on 2017/7/31.
 */
public class Plugin implements InvocationHandler {

    private Object object;
    private Interceptor interceptor;

    private Plugin(Object object, Interceptor interceptor) {
        super();
        this.object = object;
        this.interceptor = interceptor;
    }

    public static Object wrap(Object target, Interceptor interceptor) {
        Class<?> type = target.getClass();
        Class<?>[] interfaces = target.getClass().getInterfaces();
        return interfaces.length > 0 ? Proxy.newProxyInstance(type.getClassLoader(), interfaces, new Plugin(target, interceptor)) : target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object intercept = interceptor.intercept(new Invocation(method, args, object));
        return intercept;
    }
}
