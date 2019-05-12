import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

import com.ibm.xtq.xslt.runtime.Hashtable;

public class server {

	private static Socket s;
	private static ServerSocket ss;
	static int i=1;
	public static void main(String[] args) 
        {
		try
		{
			ss=new ServerSocket(1234   );
			System.out.println("\nThe server\t"+ss.getInetAddress().getLocalHost()
					+"\tis listening at port\t"+ss.getLocalPort());
			while(true)
			{
				s=ss.accept();
				new threadHandler(s,i).start();
				i++;
				
			}
			
		}
		catch(Exception ioe)
		{
			System.out.println(ioe);
			
		}
	}

}

class threadHandler extends Thread
{
	Socket clientSocket;
	int clientNo;
	DataInputStream dis;
	DataOutputStream dos;
	Hashtable ht=new Hashtable();
	BufferedReader br;
	
	threadHandler(Socket s,int n)
	{
		clientSocket=s;
		clientNo=n;
		System.out.println("Client No "+clientNo+clientSocket.getPort()+ "has logged in ");
	}
	public void run()
	{
		while(true)
		{
			try
			{
			dis=new DataInputStream(clientSocket.getInputStream());
			dos=new DataOutputStream(clientSocket.getOutputStream());
			String recd=dis.readUTF();
			System.out.println(recd);
			br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("\n\nType Message" + " for client...\n");
			String fromServer=br.readLine();
			
			dos.writeUTF("\nThanks for" +"Joining Us......."+fromServer );
			}
			catch(IOException e)
			{
				System.out.println(e);
			}
		}
	}
}
