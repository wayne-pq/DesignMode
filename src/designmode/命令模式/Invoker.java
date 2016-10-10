package designmode.命令模式;

/**
 * 调用者 （司令）
 * @author panqian
 *
 */
public class Invoker {
	
	private Command command;

	public Invoker(Command command) {
		this.command = command;
	}
	
	public void action(){
		System.out.println("“司令”下发了命令");
		command.exe();
	}
	
	
}
