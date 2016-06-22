package designmode.factory;

public class HumanFactory {

	
	public static Human createHuman(Class c){
		Human h = null;
		
		try {
			h = (Human)Class.forName(c.getName()).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("必须指定人种的颜色");
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return h;
	}
}
