//RMI CASE STUDY PROGRAM 2
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
public class ProductImpl extends UnicastRemoteObject implements Product
{

	private static final long serialVersionUID=1L;
	private String name;
	private int basic;
	
	public ProductImpl(String n,int sal)throws RemoteException
	{
		name=n;
		basic=sal;
	}
	public Object getFrame() throws RemoteException
	{
		return new Observer();
	}
	public String disp() throws RemoteException
	{
		System.out.println("disp called\n\n");
		return name;
	}
	public static void main(String[] args) 
	{
		
	}

}
class Observer extends JFrame implements ActionListener
{
	JLabel la;
	JTextArea ta;
	JButton b1;
	
	Observer()
	{
		setSize(300,400);
		Container c=getContentPane();
		c.setLayout(new GridLayout(3,1));
		b1=new JButton("From RMI Server");
		ta=new JTextArea();
		
		b1.addActionListener(this);
		la=new JLabel("Result From Server");
		
		c.add(b1);
		c.add(la);
		c.add(ta);
	}
	public void actionPerformed(ActionEvent ae)
	{
		try
		{
		ProductImp1 ob=new ProductImp1("SoftwareEngineer",50000);
		System.out.println("button pressed");
		String name=ob.disp();
		System.out.println("Name from Server:\n"+name);
		
		}
		catch(Exception e)
		{
			
		}
	}
}