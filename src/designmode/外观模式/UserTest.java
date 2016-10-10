package designmode.外观模式;

/**
 * 如果我们没有 Computer 类，那么，CPU、Memory、Disk 他们之间将会相互持有实例，产生关系，这样会造成严重的依赖
 * @author panqian
 *
 */
public class UserTest {
	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.startup();
		computer.shutdown();
	}
}
