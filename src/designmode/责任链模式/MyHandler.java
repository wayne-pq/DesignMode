package designmode.责任链模式;

public class MyHandler extends AbstractHandler implements Handler {

	private String name;
	
	private   int money;
	
	public    MyHandler(String name, int money) {
		   super();
		this.name = name;
		this.money = money;
	}

	@Override
	public void operator(int receive) {
		if(money >= receive){
			System.out.println(name+"处理了此审批");
		}else{
			if(super.getHandler()!=null){
				getHandler().operator(receive);
			}else{
				System.out.println("没有人有权利审批");
			}
		}
	}

}
