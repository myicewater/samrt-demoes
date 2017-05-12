package javastudy.doublee;

import java.math.BigDecimal;

public class DoubleTest
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        double a = 0.01;
        double b = 0.1;
        System.out.println(new BigDecimal(b).subtract(new BigDecimal(a)).setScale(2).doubleValue()  );
    }

}
