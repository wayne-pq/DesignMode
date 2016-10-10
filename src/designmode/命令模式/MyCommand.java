package designmode.命令模式;

public class MyCommand implements Command {

	private Receiver receiver;
	
	
	public MyCommand(Receiver receiver) {
		super();
		this.receiver = receiver;
	}



	@Override
	public void exe() {
		System.out.println("“命令”正在火速传递给“士兵”");
		receiver.action();
	}

}
