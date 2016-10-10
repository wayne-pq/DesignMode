package designmode.命令模式;

public class Test {

	/**
	 * 命令模式的目的是达到命令的发出者和执行者之间解耦，实现请求和执行分开
	 * @param args
	 */
	public static void main(String[] args) {
		Receiver receiver = new Receiver();
		Command command  = new MyCommand(receiver);
		Invoker invoker  = new Invoker(command);
		
		invoker.action();
	}
}
