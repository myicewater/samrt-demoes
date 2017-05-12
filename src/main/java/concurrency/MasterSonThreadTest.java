package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MasterSonThreadTest
{
    
    public static ExecutorService es = Executors.newFixedThreadPool(10);
    
    public Student process(){
        Student s = new Student(5,"luna");
        System.out.println("name is : "+s.getName());
        es.execute(new StudentThread(s));
        System.out.println("age is : "+s.getAge());
        
        return s;
    }
    
    
    
    
    

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        MasterSonThreadTest ms = new MasterSonThreadTest();
        Student s = ms.process();
        System.out.println("main : "+ s.getName() + ","+ s.getAge());
    }

}
class Student{
    private int age;
    private String name;
    
    
    
    public Student(int age, String name)
    {
        super();
        this.age = age;
        this.name = name;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    
    
}