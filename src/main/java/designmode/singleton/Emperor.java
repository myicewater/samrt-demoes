package designmode.singleton;

public class Emperor {

	private static final Emperor emperor = new Emperor();
	
	private Emperor(){
		
	}
	
	//我觉得这个地方没有必要加syschronized吧,属于读取操作
	public static Emperor getEmperor(){
		return emperor;
	}
	
	public void info(){
		System.out.println("I am emperor 999");
	}
}
