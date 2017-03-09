package setdeom;

import java.util.HashSet;
import java.util.Set;

public class SetMain
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        
        Set<String> sets = new HashSet<String>();
        
        sets.add("hello");
        sets.add("world");
        sets.add("hello");
        
        System.out.println("new set");
        for(String s : sets){
            System.out.println(s);
        }
        
        sets.remove("hello");
        System.out.println("change");
        for(String s : sets){
            System.out.println(s);
        }
    }

}
