package designmode.strategy;

public class Context {
	
	public Context(Strategy strategy){
		this.strategy = strategy;
	}
	
	private Strategy strategy;
	
	public void operate(){
		strategy.operate();
	}

	public Strategy getStrategy() {
		return strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	
}
