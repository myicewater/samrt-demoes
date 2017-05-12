package log;

import org.apache.log4j.Logger;




public class LogDemo
{
    
    private static final Logger log = Logger.getLogger("gaglog");
    
    private static final Logger classLog = Logger.getLogger(LogDemo.class);

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        System.out.println("dd");
        log.info("info log");
        log.debug("debug log");
        log.error("error log");
        
        classLog.info("class log");
    }

}
