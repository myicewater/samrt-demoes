package javastudy.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AddServiceImp extends UnicastRemoteObject implements AddService
{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    protected AddServiceImp() throws RemoteException
    {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    public int add(int a, int b) throws RemoteException
    {
        // TODO Auto-generated method stub
        return a+b;
    }

}
