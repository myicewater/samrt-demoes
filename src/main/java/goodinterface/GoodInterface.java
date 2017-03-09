package goodinterface;

import java.util.HashMap;
import java.util.Map;

public class GoodInterface
{
    
    private static Map<String,Student> school = null;
    
    public static void init(){
        school = new HashMap<String,Student>();
        Student s1 = new Student("s1",20);
        school.put("s1", s1);
    }
    
    public static Student getStudent(String key){
        if(school != null && school.get(key) != null )
            return school.get(key);
        else
            return new Student();
    }

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        init();
        System.out.println(getStudent("s1")); 
    }

}

class Student{
    private String name;
    private Integer age;
    
    public Student(){
        
    }
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString()
    {
        return "Student [name=" + name + ", age=" + age + "]";
    }
    
    
}