package designmode.factory;

public class NvWa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human h = HumanFactory.createHuman(YellowHuman.class);
		h.cry();
		h.laugh();
	}

}
