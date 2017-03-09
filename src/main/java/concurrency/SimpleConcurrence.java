package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;


public class SimpleConcurrence implements Runnable
{

    @Override
    public void run()
    {
        System.out.println("run...");
        
    }

    public static void main(String[] args)
    {
        ExecutorService tp = Executors.newFixedThreadPool(5);
        
        
        
        Future<?> submit = tp.submit(new SimpleConcurrence());
        
        for(;;){
            if(submit.isDone()){
                System.out.println("done");
                break;
            }else{
                System.out.println("还没完成");
            }
        }
        
        tp.shutdown();
        System.out.println("提前输出。。");
        
    }
}
