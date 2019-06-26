import java.rmi.*;
//RMI CASE STUDY PROGRAM 3
public class ProductServer 
{

	public static void main(String[] args) 
	{
		try
		{
			System.out.println("Prepareing Server,"+"smartServer");
			//creating instance of Implementing class
			ProductImpl p1=new ProductImpl("Software Engineer",50000);
			System.out.println("Binding"+ "object for Registry.."+" Thanks RMI");
			
			//giving identification to objects for clients
			//rmi's binding activity
			Naming.rebind("bhavesh", p1);
			System.out.println("Dear client are u not"+ "interested ???? if so then why ?");
			
		}
		catch(Exception e)
		{
			System.out.println("Charu..."+e);
		}

	}

}
