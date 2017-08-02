package designmode.代理模式.evolution03;

/**
 * 封装 生成代理对象 的逻辑代码
 *
 * @author panqian
 */
public class DynamicProxyTest {
    public static void main(String[] args) {
        Sourceable source = new Source();

        //lambda表达式直接实现,返回 [0,9] 之间的数
        Interceptor interceptor = (invocation) -> {
            System.out.println("invocation :" + invocation.toString());
            return new Double(Math.random() * 10).intValue();
        };

        Sourceable sourceable = (Sourceable) Plugin.wrap(source, interceptor);

        sourceable.method();
        System.out.println("=========");
        sourceable.method1(666);
    }
}
