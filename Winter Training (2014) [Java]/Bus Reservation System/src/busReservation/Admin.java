package busReservation;

import javax.swing.JOptionPane;

public class Admin 
{
   String username,password;
   Bus B;
   
   public Admin()
   {
	   username = "ADMIN";
	   password = "1234";
	   String u = null,p;
	   
	   try
	   {
		   u = JOptionPane.showInputDialog(null,"Enter Username : ");
	   }
	   catch(Exception e)
	   {
		   
	   }
	   
	   if(u == null)
		    return;
	   
	   try
	   {
		   p = JOptionPane.showInputDialog(null,"Enter Password : ");
	   }
	   catch(Exception e)
	   {
		   return;
	   }
	   
	   AdminLogin(u,p);
   }
   
   public void BusDetails()
   {
	   
   }
   
   public void AdminLogin(String u,String p)
   {
	   if(username.equals(u) && password.equals(p))
	   {
		   JOptionPane.showMessageDialog(null,"Login Successfull !!! ");
		   JOptionPane.showMessageDialog(null,"Welcome Admin !!! ");
	   }
	   else
	   {
		   JOptionPane.showMessageDialog(null,"The Username or Password is Incorect !!! ");
	   }
   }
}
