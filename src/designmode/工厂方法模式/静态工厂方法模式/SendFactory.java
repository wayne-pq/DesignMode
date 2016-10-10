package designmode.工厂方法模式.静态工厂方法模式;

public class SendFactory {

	public static Sender produceMail() {
		return new MailSender();
	}
	
	public static Sender produceSMS() {
		return new SmsSender();
	}
}
