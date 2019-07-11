package designmode.迭代子模式;
public interface Iterator {
	//前移
	Object previous();
	
	//后移
	Object next();

	boolean hasNext();
	
	//取得第一个元素
	Object first();
}