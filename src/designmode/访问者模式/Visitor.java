package designmode.访问者模式;
/**
 * 拓展的业务代码可以在这里写  就不用在IElement实现类中拓展了
 * @author panqian
 *
 */
public class Visitor implements IVisitor {

	@Override
	public void visit(SaveElement element) {
		System.out.println("正在执行" + element.getName() + "业务");
	}

	@Override
	public void visit(FundElement element) {
		System.out.println("正在执行" + element.getName() + "业务");
	}

}
