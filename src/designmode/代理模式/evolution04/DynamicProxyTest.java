package designmode.代理模式.evolution04;

/**
 * @author panqian
 */
public class DynamicProxyTest {
    public static void main(String[] args) {
        Sourceable source = new Source();

        //lambda表达式直接实现,返回 [0,9] 之间的数
        Interceptor interceptor = (invocation) -> {
            System.out.println("原方法开始执行");
            //执行原方法的逻辑
            invocation.proceed();
            System.out.println("原方法执行完毕");
            return new Double(Math.random() * 10).intValue();
        };

        Sourceable sourceable = (Sourceable) Plugin.wrap(source, interceptor);

        sourceable.method();
        System.out.println("=========");
        sourceable.method1(666);
    }
}
