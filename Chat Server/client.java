import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class client 
{
        private static Socket s;
        private static BufferedReader br;
	private static DataInputStream dis;
	private static DataOutputStream dos;
	private PrintWriter pw;
	public static void main(String[] args)
	{

		try
		{
			s=new Socket("localhost",1234);
			dis=new DataInputStream(s.getInputStream());
			dos=new DataOutputStream(s.getOutputStream());
		}
		catch(UnknownHostException HO)
		{
			System.out.println("Server Not Found"+HO);
			
		}
		catch(IOException SE)
		{
			System.out.println("Socket"+"Failed....."+SE);
			System.exit(0);
			
		}
		while(true)
		{
			try
			{
				System.out.println("\nEnter"+"Message for Charu's chat"+"server....");
				br=new BufferedReader(new InputStreamReader(System.in));
				String getMsg=br.readLine();
				dos.writeUTF(getMsg);
				String respo=dis.readUTF();
				System.out.println(respo);
			}
			catch(IOException io)
			{
				System.out.println("" +"Server Failed....."+io);
				System.exit(0);
			}
		}

	}

}
