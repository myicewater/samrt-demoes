package reconstructure;

public class ExtractMethod
{

    private String name;
    
    private int age;
    
    
    public static void main(String[] args)
    {
    
        helloWorld();
        
        int result = 0;
        add();
    }


    /**
     * 
     */
    public static void add()
    {
        int result;
        int a = 5;
        int b = 9;
        result = a + b;
    }


    /**
     * 
     */
    public static void helloWorld()
    {
        System.out.println("Hello");
        System.out.println("World");
    }
}
