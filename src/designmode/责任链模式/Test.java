package designmode.责任链模式;

import java.io.IOException;
/**
 * 每个对象持有对下一个对象的引用，这样就会形成一条链，请求在这条链上传递，直到某一对象决定处理该请求。
 * 
 * 本例中三个MyHandler对象 h1,h2,h3 分别能处理    (0,100]   (100,200]  (200,300]  金额的请求，如果金额不在自己的管理范围内，请求就会传递给下一个处理者
 * 
 * 此处强调一点就是，链接上的请求可以是一条链，可以是一个树，还可以是一个环，模式本身不约束这个，需要我们自己去实现，同时，在一个时刻，命令只允许由一个对象传给另一个对象，而不允许传给多个对象。
 * @author panqian
 *
 */
public class Test {
	public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, IOException {
		MyHandler h1 = new MyHandler("h1",100);
		MyHandler h2 = new MyHandler("h2",200);
		MyHandler h3 = new MyHandler("h3",300);
		
		h1.setHandler(h2);
		h2.setHandler(h3);
		
		h1.operator(199);
	}
}
