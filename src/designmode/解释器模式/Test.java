package designmode.解释器模式;

/**
 * 解释器模式用来做各种各样的解释器，内部封装好，外部传入参数调用即可，如正则表达式等的解释器
 * @author panqian
 *
 */
public class Test {

	public static void main(String[] args) {
		Context context = new Context(1, 2);
		//执行5-(1+2)
		int result = new Minus().interpret(new Context(5, new Plus().interpret(context)));
		System.out.println(result);
	}

}
