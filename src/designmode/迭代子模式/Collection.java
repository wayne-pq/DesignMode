package designmode.迭代子模式;


public interface Collection {

	Iterator iterator();

	/* 取得集合元素 */
	Object get(int i);

	/* 取得集合大小 */
	int size();
}
