package designmode.命令模式;

/**
 * 被調用者（士兵）
 * @author panqian
 *
 */
public class Receiver {
	public void action(){
		System.out.println("士兵接收到了“命令”");
	}
}
