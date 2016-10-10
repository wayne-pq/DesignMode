package designmode.中介者模式;
/**
 * 中介者模式也是用来降低类类之间的耦合的，因为如果类类之间有依赖关系的话，不利于功能的拓展和维护
 * 如果使用中介者模式，只需关心和Mediator类的关系，具体类类之间的关系及调度交给Mediator就行
 * @author panqian
 *
 */
public class Test {
	public static void main(String[] args){
		Mediator mediator = new MyMediator();
		mediator.createMediator();
		mediator.workAll();
	}
}
