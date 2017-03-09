package excutor;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorDemo
{

    /**
     * @param args
     * @throws ExecutionException 
     * @throws InterruptedException 
     */
    public static void main(String[] args) throws InterruptedException, ExecutionException
    {
        // TODO Auto-generated method stub

        ExecutorService ex = Executors.newSingleThreadExecutor();
        
       Future<Integer> r =  ex.submit(new Callable<Integer>()
        {

            public Integer call() throws Exception
            {
                // TODO Auto-generated method stub
                Thread.sleep(4000);
                return 2;
            }
        });
       System.out.println("running");
       
       if(r.get() == 2){
           System.out.println("The result is 2");
           ex.shutdown();
       }else{
           System.out.println("result is not 2");
       }
    }

}
