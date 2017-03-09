import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import junit.framework.TestCase;


public class MapTest extends TestCase
{

    public static void main(String[] args)
    {
        
    }
    
    
    public static void testMapToListTest(){
        Map m = new HashMap<String,String>();
        m.put("aa", "aaaa");
        m.put("bb", "bbbb");
        
        List<String> l = new ArrayList(m.values());
        
        for(String s : l)
            System.out.println(s);
    }
    
    public static void chinaeseKeyTest(){
        Map m = new HashMap();
        m.put("哈哈", "haha");
        System.out.println(m.get("哈哈"));
    }
}
