package designmode.适配器模式.对象的适配器模式;

/**
 *  Source 类， 拥有一个方法， 待适配（作为Adapter的变量属性）
 * @author panqian
 *
 */
public class Source {
	public void method1(){
		System.out.println("this is original method!");
	}
}