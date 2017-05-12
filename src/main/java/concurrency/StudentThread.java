package concurrency;

public class StudentThread implements Runnable
{

    Student s;
    
    
    
    public StudentThread(Student s)
    {
        this.s = s;
    }



    @Override
    public void run()
    {
        // TODO Auto-generated method stub
        try
        {
            Thread.sleep(1000);
            System.out.println(s.getName()+"'s age is "+s.getAge());
        }
        catch (InterruptedException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
