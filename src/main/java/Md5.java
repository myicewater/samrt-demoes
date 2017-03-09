import sun.security.provider.MD5;



public class Md5 {

	public static void main(String[] args) {
		MD5 m = new MD5();
		Person  p = new Person();
		p.setAge(8);
		if(p != null && p.getName() != null && p.getName().equals("aa")){
		    System.out.println("ahha");
		}else{
		    System.out.println("dd");
		}
	}
}
