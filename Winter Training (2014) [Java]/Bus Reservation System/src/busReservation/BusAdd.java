package busReservation;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.PrintWriter;

public class BusAdd 
{
    public BusAdd()
    {
    	
    }

	public void BusAdd(Bus b) 
	{

    	PrintWriter pw = new PrintWriter(System.out,true);
    	
    	try(ObjectInputStream oout = new ObjectInputStream(new FileInputStream("BusInfo.txt")))
    	{
    		
    	}
    	catch(Exception e)
    	{
    		pw.println("Data");
    	}
	}
}
