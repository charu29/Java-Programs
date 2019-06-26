import java.rmi.*;
//RMI CASE STUDY PROGRAM 1
public interface Product extends Remote
{
//interface are used to declare remote method
	Object getFrame()throws RemoteException;
	String disp() throws RemoteException;
}
