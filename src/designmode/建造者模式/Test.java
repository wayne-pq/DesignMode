package designmode.建造者模式;

public class Test {

	/**
	 * 建造者模式和工厂模式的区别：
	 * 建造者模式注重零部件的组装过程,而工厂方法模式更注重零部件的创建过程
	 * @param args
	 */
	public static void main(String[] args) {
		Builder builder = new CommonBuilder();
		Director director = new Director(builder);
		director.construct();
		Product result = builder.getResult();
		System.out.println(result);
	}
}
