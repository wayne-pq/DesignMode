package designmode.访问者模式;

/**
 * 一个Visitor类，存放要访问的对象
 * @author panqian
 *
 */
public interface IVisitor {
	
	public void visit(SaveElement element);

	public void visit(FundElement element);
}
