package designmode.访问者模式;

/**
 * 存款类
 * @author panqian
 *
 */
public class SaveElement implements IElement {

	private String name = "存款业务";
	
	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
