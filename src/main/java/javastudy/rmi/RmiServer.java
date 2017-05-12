package javastudy.rmi;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class RmiServer
{

    public static void main(String[] args)
    {
        try
        {
            LocateRegistry.createRegistry(1088);
            AddService addService = new AddServiceImp();
            Naming.bind("testRmi", addService);
            System.out.println("service is ready..");
        }
        catch (RemoteException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (MalformedURLException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (AlreadyBoundException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
