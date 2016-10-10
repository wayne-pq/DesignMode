package designmode.访问者模式;

/**
 * 如果我们想为一个现有的类增加新功能,又不允许修改原代码,可以用访问者模式
 * @author panqian
 *
 */
public class Test {
	public static void main(String[] args) {

		// 执行存款业务
		IElement saveElement = new SaveElement();
		saveElement.accept(new Visitor());

		// 执行基金业务
		IElement fundElement = new FundElement();
		fundElement.accept(new Visitor());
	}
}
