package designmode.工厂方法模式.多工厂方法模式;

public class MailSender implements Sender {

	@Override
	public void send() {
		System.out.println("this is mailsender!");
	}

}
