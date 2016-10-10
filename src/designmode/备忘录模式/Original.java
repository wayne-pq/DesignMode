package designmode.备忘录模式;

public class Original {
	
	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Original(String value) {
		this.value = value;
	}
	
	public Memento createMemento(){
		return new Memento(value);
	}
	
	public void restoreValue(Memento memento){
		this.value = memento.getValue();
	}
	
}
