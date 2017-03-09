package watchtime;

import org.apache.commons.lang3.time.StopWatch;

public class StopWatchDemo
{

    /**
     * @param args
     * @throws InterruptedException 
     */
    public static void main(String[] args) throws InterruptedException
    {
        // TODO Auto-generated method stub
        StopWatch s =new  StopWatch();
        s.start();
        //Thread.sleep(500);
        int ii = 48569*26625;
        for(int i=0;i<10000000;i++){
            String st = new String();
        }
        s.stop();
        System.out.println("时间消耗："+s.getTime());
        
        StopWatch ss = new StopWatch();
         ss.start();
         ss.stop();
         System.out.println(ss.getTime());;
    }

}
