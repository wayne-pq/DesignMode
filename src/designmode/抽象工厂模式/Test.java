package designmode.抽象工厂模式;

public class Test {

	public static void main(String[] args) {
		Provider provider = new SendMailFactory();
		Sender produce = provider.produce();
		produce.send();
	}

}
