package designmode.访问者模式;

/**
 * accept方法，接受将要访问它的对象
 * @author panqian
 *
 */
public interface IElement {
	public void accept(IVisitor visitor);
}
