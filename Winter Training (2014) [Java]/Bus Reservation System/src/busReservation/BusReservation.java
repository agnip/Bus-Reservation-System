package busReservation;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class BusReservation extends JFrame implements ActionListener
{
    JButton login,customer;
    Container c;
	
	public BusReservation()
    {
       
		super("Bus Reservation");
		
	   c= getContentPane();
       setLayout(new GridLayout());
       
       login = new JButton("LOGIN");
       customer = new JButton("CUSTOMER");
       
       login.addActionListener(this);
       customer.addActionListener(this);
       
       c.add(login);c.add(customer);
       
       setSize(300,200);
       setLocation(200,200);
       setVisible(true);
       setResizable(false);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

	
	public void actionPerformed(ActionEvent ae) 
	{
		if(ae.getSource() == login)
		{
			new Admin();
		}
		
		if(ae.getSource()==customer)
		{
			new Customer();
		}
	}
	
	public static void main(String args[])
	{
		new BusReservation();
	}
}