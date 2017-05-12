package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;


public class SimpleConcurrence implements Runnable
{
    
    static final ExecutorService tp = Executors.newFixedThreadPool(5);
    
    private int num;
    
    public SimpleConcurrence(int num){
        this.num = num;
    }

    @Override
    public void run()
    {
        
        
        try
        {
            System.out.println("start..."+num);
            Thread.sleep(200);
            System.out.println("end..."+num);
        }
        catch (InterruptedException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
    
    public static int getNum(){
        //考虑这两个区别
        tp.submit(new SimpleConcurrence(7)); 
        tp.execute(new SimpleConcurrence(10));
        
        return 5;
    }

    public static void main(String[] args)
    {
        int n = getNum();
        System.out.println("n is : "+ n);
        
        
        
    }
}
