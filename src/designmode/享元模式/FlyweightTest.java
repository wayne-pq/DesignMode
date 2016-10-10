package designmode.享元模式;

/**
 * 享元模式的主要目的是实现对象的共享，即共享池，当系统中对象多的时候可以减少内存的开销
 * 
 * @author panqian
 *
 */
public class FlyweightTest {
	public static void main(String[] args) {
		ConnectionPool pool = ConnectionPool.getInstance();
		System.out.println("初始化完成，线程池共有" + pool.getPool().size() + "个线程");
		int i = pool.getConnection();
		System.out.println("取得线程" + i + "现在还有" + pool.getPool().size() + "个线程");
	}
}
