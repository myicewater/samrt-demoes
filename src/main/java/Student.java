
public class Student extends Person
{

    String major;
    
    String schId;

    public String getMajor()
    {
        return major;
    }

    public void setMajor(String major)
    {
        this.major = major;
    }

    public String getSchId()
    {
        return schId;
    }

    public void setSchId(String schId)
    {
        this.schId = schId;
    }

    @Override
    public String toString()
    {
        return "Student [major=" + major + ", schId=" + schId + ", name=" + name + ", age=" + age + "]";
    }
    
    
    
}
