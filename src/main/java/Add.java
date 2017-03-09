import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;


public class Add
{

    
    public static Integer add(Integer a ,Integer b){
        return a+b;
    }
    
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        //ystem.out.println(add(null,2));
        Map ma = new HashMap();
        ma.put("a", "aa");
        ma.put("dd", null);
        System.out.println(ma.get("dd"));
        List<String> l = new ArrayList<String>();
        l.add("add");
        l.add(null);
        for(String a : l){
            System.out.println("哈哈："+a);
        }
        
        Set<String> s = new HashSet<String>();
        s.add("yyy");
        s.add(null);
        for(String ss : s){
            System.out.println("滴滴："+ss);
        }
        
        System.out.println(ma != null && ma.size() > 0);
        
        System.out.println(UUID.randomUUID().toString().replace("-", "").toUpperCase());;
        
        
        System.out.println(24*60*60);
    }

}
