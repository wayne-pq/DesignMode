package designmode.代理模式.evolution02;


/**
 * 被代理对象
 *
 * @author panqian
 */
public class Source implements Sourceable {

    @Override
    public void method() {
        System.out.println("the original method!");
    }

    @Override
    public void method1(int i) {
        System.out.println("the original method1!");
    }

}
