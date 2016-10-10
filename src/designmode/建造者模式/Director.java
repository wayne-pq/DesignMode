package designmode.建造者模式;

/**
 * 调用具体建造者来创建复杂对象的各个部分，在指导者中不涉及具体产品的信息，只负责保证对象各部分完整创建或按某种顺序创建。
 * @author panqian
 *
 */
public class Director {
	private Builder builder;

	public Director(Builder builder) {
		this.builder = builder;
	}

	public void construct() {
		builder.buildPartA();
		builder.buildPartB();
		builder.buildPartC();
	}
}
