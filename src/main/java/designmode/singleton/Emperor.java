package designmode.singleton;

public class Emperor {

	private static final Emperor emperor = new Emperor();
	
	private Emperor(){
		
	}
	
	//�Ҿ�������ط�û�б�Ҫ��syschronized��,���ڶ�ȡ����
	public static Emperor getEmperor(){
		return emperor;
	}
	
	public void info(){
		System.out.println("I am emperor 999");
	}
}
