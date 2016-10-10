package designmode.桥接模式;

/**
 * 定义一个桥，持有 Sourceable 的一个实例：
 * @author panqian
 *
 */
public abstract class Bridge {
	
	private Sourceable sourceable;
	
	public void method(){
		sourceable.method();
	}
	
	public Sourceable getSource(){
		return sourceable;
	}
	
	public void setSource(Sourceable sourceable) {
		this.sourceable = sourceable;
	}
}
