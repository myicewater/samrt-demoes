package instanceo;

public class InstanceOfDemo
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

        Person t = new Teacher("t1","math");
        Person s = new Student("s1",123);
        
        if(t instanceof Teacher){
            Teacher t1 = (Teacher)t;
            System.out.println("My subject is :"+t1.getSubject());
        }else if(t instanceof Student){
            Student s1 = (Student)t;
            System.out.println("My number is :"+s1.getStudentNum());
        }
    }

}

class Person{
    private String name;
    
    public Person(String name){
        this.name  = name;
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

class Teacher extends Person{
    private String subject;
    
    public Teacher(String name,String subject){
        super(name);
        this.subject = subject;
    }

    public String getSubject()
    {
        return subject;
    }

    public void setSubject(String subject)
    {
        this.subject = subject;
    }
    
    
}

class Student extends Person{
    private Integer studentNum;
    
    public Student(String name, Integer studentNum){
        super(name);
        this.studentNum = studentNum;
    }

    public Integer getStudentNum()
    {
        return studentNum;
    }

    public void setStudentNum(Integer studentNum)
    {
        this.studentNum = studentNum;
    }
    
    
}