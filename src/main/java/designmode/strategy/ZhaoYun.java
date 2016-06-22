package designmode.strategy;

public class ZhaoYun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Strategy strategy = new BackDoor();
		
		Context context = new Context(strategy);
		
		context.operate();
		
		strategy = new BlockEnemy();
		
		context.setStrategy(strategy);
		
		context.operate();
	}

}
