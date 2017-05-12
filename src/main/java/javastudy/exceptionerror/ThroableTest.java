package javastudy.exceptionerror;

public class ThroableTest
{

    public static void main(String[] args)
    {
        
        try
        {
            double i = 8/0;
            System.out.println(i);
        }
        catch (Throwable e)
        {
            // TODO Auto-generated catch block
            System.out.println("捕获到了东西");
            e.printStackTrace();
        }
    }
}
