package designmode.抽象工厂模式;

public class SmsSender implements Sender {

	@Override
	public void send() {
		System.out.println("this is sms sender!");
	}

}
