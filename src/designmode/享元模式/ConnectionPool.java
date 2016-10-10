package designmode.享元模式;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {

	private List<Integer> pool;

	/* 公有属性 */
	// private String url = "jdbc:mysql://localhost:3306/test";
	// private String username = "root";
	// private String password = "root";
	// private String driverClassName = "com.mysql.jdbc.Driver";

	private int poolSize = 100;
	private static ConnectionPool instance = null;
	Integer conn = null;

	/* 构造方法，做一些初始化工作 */
	private ConnectionPool() {
		pool = new ArrayList<Integer>(poolSize);

		for (int i = 0; i < poolSize; i++) {
			pool.add(i);
		}
	}

	public static ConnectionPool getInstance() {
		if (null == instance) {
			synchronized (ConnectionPool.class) {
				if (null == instance)
					instance = new ConnectionPool();
			}
		}
		return instance;
	}

	/* 返回连接到连接池 */
	// public synchronized void release() {
	// pool.add(conn);
	// }

	/* 返回连接池中的一个数据库连接 */
	public synchronized Integer getConnection() {
		if (pool.size() > 0) {
			Integer i = pool.get(0);
			pool.remove(i);
			return i;
		} else {
			return null;
		}
	}

	public List<Integer> getPool() {
		return pool;
	}

	public void setPool(List<Integer> pool) {
		this.pool = pool;
	}

}
