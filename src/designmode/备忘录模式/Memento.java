package designmode.备忘录模式;
/**
 * 备忘录类,保存 Original类的value值
 * @author panqian
 *
 */
public class Memento {
	private String value;

	public Memento(String value) {
		super();
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	
}
