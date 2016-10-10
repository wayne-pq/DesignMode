package designmode.单例模式.饿汉式;

public class Singleton {

	private static Singleton singleton = new Singleton();

	private Singleton() {
	}

	public static Singleton getInstance() {
		return singleton;
	}
}
