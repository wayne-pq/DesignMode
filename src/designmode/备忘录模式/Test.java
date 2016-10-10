package designmode.备忘录模式;

/**
 * 主要目的是保存一个对象的某个状态，以便在适当的时候恢复对象，
 * @author panqian
 *
 */
public class Test {

	public static void main(String[] args) {
		//原始值是100
		Original original = new Original("100");
		
		System.out.println("初始化状态为："+original.getValue());
		
		Memento memento = original.createMemento();
		//备份放入管理类中
		Storage storage = new Storage(memento);
		
		//修改值为200
		original.setValue("200");
		
		System.out.println("修改后状态为："+original.getValue());
		
		original.restoreValue(storage.getMemento());
		
		System.out.println("还原后状态为："+original.getValue());
	}

}
