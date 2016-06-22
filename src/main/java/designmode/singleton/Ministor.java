package designmode.singleton;

public class Ministor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emperor emperor = Emperor.getEmperor();
		emperor.info();
		Emperor emperor2 = Emperor.getEmperor();
		emperor2.info();
	}

}
