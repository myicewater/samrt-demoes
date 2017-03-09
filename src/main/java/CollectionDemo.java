import java.util.HashSet;
import java.util.Set;


public class CollectionDemo
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        
        Set<String> set = new HashSet<String>();
        set.add("a");
        set.add("b");
        
        set.remove("c");
        
        for(String s : set){
            System.out.println(s);
        }
    }

}
