package designmode.建造者模式;

/**
 * 实现Builder接口，针对不同的商业逻辑，具体化复杂对象的各部分的创建。 在建造过程完成后，提供产品的实例。
 * @author panqian
 *
 */
public class CommonBuilder implements Builder {
	
	Product product = new Product();
	String partA="A", partB="B", partC="C";
	
	@Override
	public void buildPartA() {
		product.setPartA(partA);
	}

	@Override
	public void buildPartB() {
		product.setPartB(partB);
	}

	@Override
	public void buildPartC() {
		product.setPartC(partC);
	}

	@Override
	public Product getResult() {
		return product;
	}

}
