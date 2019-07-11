package designmode.单例模式.CAS方式;

import java.util.concurrent.atomic.AtomicReference;

/**
 * 懒汉式，饿汉式，其实现原理都是利用借助了类加载的时候初始化单例。即借助了ClassLoader的线程安全机制。
 * <br/><br/>
 * <p>所谓ClassLoader的线程安全机制，就是ClassLoader的loadClass方法在加载类的时候使用了synchronized关键字。也正是因为这样， 除非被重写，这个方法默认在整个装载过程中都是同步的，也就是保证了线程安全。
 * <br/><br/>
 * <p>所以，以上各种方法，虽然并没有显示的使用synchronized，但是还是其底层实现原理还是用到了synchronized。
 * <br/> <br/>
 * <p>我们用CAS实现无锁单例
 */
public class Singleton {

    private static volatile AtomicReference<Singleton> atomicReference = new AtomicReference();

    private Singleton() {
    }

    public static Singleton getInstance() {
        while (true) {
            Singleton singleton = atomicReference.get();
            if (null == singleton) {
                atomicReference.compareAndSet(null, new Singleton());
                continue;
            }
            return singleton;
        }
    }

}
