package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListAddRemove
{

    public static void main(String[] args)
    {
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        
        
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String s = iterator.next();
            if("2".endsWith(s)){
                list.remove(s);
            }
        }
        
        for(String s : list){
            System.out.println(s);
        }
    }
}
