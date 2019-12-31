package designmode.单例模式.双重检查;

/**
 * 说它是懒汉式，因为
 * SingletonHolder类没有被主动使用，只有显示通过调用getInstance方法时，才会显示装载SingletonHolder类，从而实例化instance
 *
 * @author panqian
 */
public class Singleton {

    private static volatile Singleton obj;

    private Singleton() {
    }


    public static Singleton getInstance() {
        if (obj == null) {
            synchronized (Singleton.class) {
                if (obj == null) {
                    obj = new Singleton();
                }
            }
        }
        return obj;
    }


}
