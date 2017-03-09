package concurrency;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorTest
{

    
    public static void main(String[] args)
    {
        ThreadPoolExecutor t = new ThreadPoolExecutor(5, 10, 30, TimeUnit.MINUTES, new ArrayBlockingQueue<Runnable>(10));
        
        
    }
    
    private class TestThreadFactory implements ThreadFactory{

        @Override
        public Thread newThread(Runnable r)
        {
            // TODO Auto-generated method stub
            Thread t = new Thread();
            return t;
        }
        
    }
}
