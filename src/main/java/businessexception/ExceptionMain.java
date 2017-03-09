package businessexception;

public class ExceptionMain
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        ExceptionMain main = new ExceptionMain();
        main.boo();
    }
    
    public void foo() throws Exception{
        System.out.println("foo");
        throw new Exception("祖异常");
    }
    
    public void assertNotZero(int i) throws BusinessException{
        System.out.println("assertNotZero");
        if(i == 0){
            throw new BusinessException("01","等于0异常");
        }
    }
    
    public void boo(){
        int i =0;
        try
        {
            assertNotZero(i);
            foo();
        }
        catch (BusinessException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("code:"+e.getErrCode());
        }
        catch (Exception e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
            
        }
        finally{
            System.out.println("最终处理程序");
        }
        
        System.out.println("最终的输出");
    }

}
