package designmode.proxy;

public class WangPo implements KindWomen {

	private KindWomen women ;
	
	public WangPo(){
		this.women = new PanJinLian();
	}
	
	public WangPo(KindWomen women){
		this.women = women;
	}
	
	@Override
	public void makeEyesWithMan() {
		// TODO Auto-generated method stub
		women.makeEyesWithMan();
	}

	@Override
	public void happyWithMan() {
		// TODO Auto-generated method stub
		women.happyWithMan();
	}

}
