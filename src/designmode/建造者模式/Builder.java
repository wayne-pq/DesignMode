package designmode.建造者模式;
/**
 * 给出一个抽象接口，以规范产品对象的各个组成成分的建造。这个接口规定要实现复杂对象的哪些部分的创建，并不涉及具体的对象部件的创建。
 * @author panqian
 *
 */
public interface Builder {
	void buildPartA();

	void buildPartB();

	void buildPartC();

	Product getResult();
}
