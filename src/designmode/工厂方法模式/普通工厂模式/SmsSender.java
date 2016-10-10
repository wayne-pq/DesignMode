package designmode.工厂方法模式.普通工厂模式;

public class SmsSender implements Sender {

	@Override
	public void send() {
		System.out.println("this is sms sender!");
	}

}
