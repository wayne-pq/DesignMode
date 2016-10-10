package designmode.工厂方法模式.多工厂方法模式;

public class SendFactory {

	public Sender produceMail() {
		return new MailSender();
	}
	
	public Sender produceSMS() {
		return new SmsSender();
	}
}
