package javastudy;

public class AndOrTest
{

    public static boolean tureReturn(){
        System.out.println("true 1");
        return true;
    }
    
    public static boolean tureReturn2(){
        System.out.println("true 2");
        return true;
    }
    
    public static boolean falseReturn(){
        System.out.println("flase 1");
        return false;
    }
    
    public static boolean falseReturn2(){
        System.out.println("flase 2");
        return false;
    }
    
    public static void main(String[] args)
    {
        System.out.println("start");
        System.out.println("与短路测试");
        if(falseReturn() && falseReturn2()){
            
        }
        System.out.println("与非短路测试");
        if(falseReturn() & falseReturn2()){
            
        }
        System.out.println("或短路测试");
        if(tureReturn() || tureReturn2()){
            
        }
        System.out.println("或非短路测试");
        if(tureReturn() | tureReturn2()){
            
        }
        
    }
}
