package designmode.代理模式.evolution05;

/**
 * @author panqian
 */
public class DynamicProxyTest {
    public static void main(String[] args) {
        Sourceable source = new Source();

        //lambda表达式貌似不能加注解，所以换成传统实现类
        Interceptor interceptor = new MyInterceptor();

        Sourceable sourceable = (Sourceable) Plugin.wrap(source, interceptor);

        sourceable.method();
        System.out.println("=========");
        sourceable.method1(666);
    }
}
