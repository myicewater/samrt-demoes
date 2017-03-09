package goagomath;

public class GoagoMath
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

        double a = 2.0D;
        double b = 3.0d;
        double c = 0.00D;
        
        System.out.println(Double.MAX_EXPONENT);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_EXPONENT);
        System.out.println(Double.MIN_NORMAL);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.NEGATIVE_INFINITY);
        
        System.out.println(Double.POSITIVE_INFINITY);
        
        System.out.println();
        System.out.println();
        
        System.out.println(MathUtils.add(a, b));
        
        System.out.println(MathUtils.mul(a, b));
        
        System.out.println(MathUtils.div(a , b, 7));
        
        System.out.println(MathUtils.round(5.7839435d, 6));
        
        System.out.println(MathUtils.sub(a, b));
        
        
        System.out.println(c == 0.0d);
    }

}
