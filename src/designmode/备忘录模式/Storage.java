package designmode.备忘录模式;

/**
 * Storage类是存储备忘录的类，持有Memento类的实例
 * @author panqian
 *
 */
public class Storage {
	
	private Memento memento;

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}

	public Storage(Memento memento) {
		super();
		this.memento = memento;
	}
	
}
