package javastudy.comaprator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class ComparatorTest
{

    /**
     * @param args
     * @throws ParseException 
     */
    public static void main(String[] args) throws ParseException
    {
        List<Student> students = new ArrayList<Student>();
        Student a = new Student("a", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2016-02-03 12:23:05"));
        
        Student b = new Student("b", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2016-02-04 12:23:05"));
        
        Student d = new Student("d", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2016-02-06 12:23:05"));
        students.add(a);
        students.add(d);
        students.add(b);
        
        for(Student s : students){
            System.out.println(s);
        }
        
        Comparator<Student> c = new Comparator<Student>()
        {
            
            @Override
            public int compare(Student o1, Student o2)
            {
                if(o1.getDate().after(o2.getDate()) ){
                    return -1;
                }else{
                    return 1;
                }
            }
        };
        System.out.println("After sort!");
        
        Collections.sort(students,c);
        
        for(Student s : students){
            System.out.println(s);
        }
    }
    
    

}

class Student{
    
    public Student(String name,Date date){
        this.name = name;
        this.date = date;
    }
    private String name;
    
    private Date date;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Date getDate()
    {
        return date;
    }

    public void setDate(Date date)
    {
        this.date = date;
    }

    @Override
    public String toString()
    {
        return "Student [name=" + name + ", date=" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date) + "]";
    }
    
    
}
