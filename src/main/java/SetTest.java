import java.util.HashSet;
import java.util.Set;


public class SetTest
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Set<String> set = new HashSet<String>();
        System.out.println(set == null);
        
        set.add("aa");
        System.out.println(set.toString());
        set.remove("aa");
        System.out.println(set.toString());
        System.out.println(set == null);
        
    }

}
