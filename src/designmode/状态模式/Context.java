package designmode.状态模式;

/**
 * 状态模式的切换类
 * @author panqian
 *
 */
public class Context {
	private State state;

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public Context(State state) {
		super();
		this.state = state;
	}

	public void method(){
		if(state.getValue().equals("state1")){
			state.method1();
		}else{
			state.method2();
		}
	}
}
