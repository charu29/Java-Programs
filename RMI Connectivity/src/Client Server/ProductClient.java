import java.rmi.*;

import javax.swing.JFrame;
//RMI CASE STUDY PROGRAM 4
public class ProductClient 
{
	public static void main(String[] args) 
	{
		System.setSecurityManager(new RMISecurityManager());
		
		//url of remote server by using rmi protocol.
		
		String url="rmi://localhost/";
		try
		{
			//first remote object must be converted in 
			Product c1=(Product)Naming.lookup(url+"bhavesh");
			//then it must converted in appropriate type.
			JFrame f1=(JFrame)c1.getFrame();
			//now we can call remote method from local 
			f1.setSize(400,500);
			f1.show();
		}
		catch(Exception e)
		{
			System.out.println("Error"+e);
		}

	}

}
