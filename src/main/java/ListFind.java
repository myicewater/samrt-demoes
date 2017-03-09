import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.apache.commons.lang3.time.StopWatch;


public class ListFind
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        List<Studen> studen = new ArrayList<Studen>();
        //List<StudenUp> up = new ArrayList<StudenUp>();
        //List<StudentDown> down = new ArrayList<StudentDown>();
        List<StudenUp> up = new ArrayList<StudenUp>();
        List<StudentDown> down = new ArrayList<StudentDown>();
        StopWatch st = new StopWatch();
        
        st.start();
        for(int i=0 ;i< 100;i++){
            String id = getString();
            StudenUp su = new StudenUp(id, getString());
            StudentDown sd = new StudentDown(id, getString());
            up.add(su);
            down.add( sd);
            
        }
        st.stop();
        System.out.println("初始化数据消耗时间:"+st.getTime());
        Collections.shuffle(up);
        
        st.reset();
        
        st.start();
        for (StudenUp u : up)
        {
            for(StudentDown d : down){
                if(u.getId().equals(d.getId())){
                    Studen s = new Studen(u.getId(), u.getName(), d.getAddr());
                    studen.add(s);
                }
            }

            

        }
        st.stop();
        
        System.out.println("消耗时间："+st.getTime());
        System.out.println("size："+studen.size());
    }
    
    public static String getString(){
        return UUID.randomUUID().toString().replace("-", "").toUpperCase();
    }
    
    

}


class Studen{
    
    private String id ;
    
    private String name;
    
    private String addr;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getAddr()
    {
        return addr;
    }

    public void setAddr(String addr)
    {
        this.addr = addr;
    }

    public Studen(String id, String name, String addr)
    {
        super();
        this.id = id;
        this.name = name;
        this.addr = addr;
    }
    
    
}

class StudenUp{
    private String id;
    
    private String name;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public StudenUp(String id, String name)
    {
        super();
        this.id = id;
        this.name = name;
    }
    
    
}

class StudentDown{
    private String id;
    
    private String addr;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getAddr()
    {
        return addr;
    }

    public void setAddr(String addr)
    {
        this.addr = addr;
    }

    public StudentDown(String id, String addr)
    {
        super();
        this.id = id;
        this.addr = addr;
    }
    
    
}
