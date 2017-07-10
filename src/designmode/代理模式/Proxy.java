package designmode.代理模式;

/**
 * Proxy 是一个代理类 静态代理
 *
 * @author panqian
 */
public class Proxy implements Sourceable {

    public Source source;

    public Proxy(Source source) {
        super();
        this.source = source;
    }

    @Override
    public void method() {
        System.out.println("before proxy!");
        source.method();
        System.out.println("after proxy!");
    }

    @Override
    public void method1() {
        System.out.println("before proxy1!");
        source.method();
        System.out.println("after proxy1!");
    }

}
