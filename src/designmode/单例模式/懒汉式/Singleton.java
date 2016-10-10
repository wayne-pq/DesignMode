package designmode.单例模式.懒汉式;
/**
 * 说它是懒汉式，因为
 * SingletonHolder类没有被主动使用，只有显示通过调用getInstance方法时，才会显示装载SingletonHolder类，从而实例化instance
 * @author panqian
 *
 */
public class Singleton {
	
	/**
	 * 静态内部类保证线程同步
	 * @author panqian
	 *
	 */
	private static class SingletonHolder{
		private static Singleton singleton = new Singleton();
	}

	private Singleton() {
	}

	public static Singleton getInstance() {
		return SingletonHolder.singleton;
	}
}
