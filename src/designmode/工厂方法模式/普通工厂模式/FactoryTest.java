package designmode.工厂方法模式.普通工厂模式;

/**
 * 普通简单工厂
 * @author panqian
 *
 */
public class FactoryTest {
	public static void main(String[] args) {
		SendFactory factory = new SendFactory();
		Sender produce = factory.produce("mail");
		produce.send();
	}
}
