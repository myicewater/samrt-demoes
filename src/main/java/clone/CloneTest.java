package clone;

public class CloneTest
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Student s = new Student();
        Student[] stu = new Student[1];
        stu[0] = s;
        Student[] stuC = new Student[1];
        System.arraycopy(stu, 0, stuC, 0, 1);
        System.out.println(stuC[0] == s);
        System.out.println(stu == stuC);
        Object o;
    }
    

}
class Student{
    
}
