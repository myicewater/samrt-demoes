package javastudy.classloder;

public class ClassLoaderTest
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        System.out.println(classLoader);
        Class<? extends ClassLoader> class1 = classLoader.getClass();
        System.out.println(class1);
        ClassLoader parent = classLoader.getParent();
        System.out.println(parent);
        try
        {
            Class<ClassLoaderTest> loadClass = (Class<ClassLoaderTest>)classLoader.loadClass("javastudy.classloder.ClassLoaderTest");
            System.out.println(loadClass);
            ClassLoaderTest newInstance = loadClass.newInstance();
            newInstance.hello();
        }
        catch (Exception e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
    
    public void hello(){
        System.out.println("world!");
    }

}
