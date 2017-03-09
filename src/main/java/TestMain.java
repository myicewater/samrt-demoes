
public class TestMain
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        
        Person p = new Person();
        p.setAge(20);
        p.setName("gaga");
        
        Student s = new Student();
        s.setAge(80);
        s.setName("uu");
        s.setMajor("math");
        s.setSchId("108");
        
        Person p2 = (Person)s;
        
        System.out.println(p2);
    }

}
