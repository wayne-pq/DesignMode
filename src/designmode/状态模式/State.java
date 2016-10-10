package designmode.状态模式;

/**
 * 状态类
 * 
 * @author panqian
 *
 */
public class State {
	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public void method1() {
		System.out.println("QQ上线啦");
	}

	public void method2() {
		System.out.println("QQ下线啦");
	}
}
