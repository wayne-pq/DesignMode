package designmode.适配器模式.对象的适配器模式;

/**
 * 目标接口是 Targetable
 * @author panqian
 *
 */
public interface Targetable {
	
	//于原类中的方法相同	
    void method1();

	//新类的方法
    void method2();
	
}