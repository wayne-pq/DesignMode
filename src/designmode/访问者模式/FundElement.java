package designmode.访问者模式;

/**
 * 基金类
 * @author panqian
 *
 */
public class FundElement implements IElement {

	private String name = "基金业务";
	
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
