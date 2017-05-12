package javastudy.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AddService extends Remote
{

    public int add(int a ,int b) throws RemoteException;
}
