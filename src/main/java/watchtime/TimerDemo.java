package watchtime;

import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Timer  t = new Timer("timer test");
        
        long delay =  2000;//5*1000 延迟多长时间开始,为了指定第一次执行的时间
        long period = 3000;//每次执行中间间隔时间
        t.schedule(new TimerTask()
        {
            
            @Override
            public void run()
            {
                // TODO Auto-generated method stub
                for(int i=0;i<3;i++){
                    System.out.println("Print simple rule:"+i);
                }
            }
        }, delay   , period);
        
        
    }

}
