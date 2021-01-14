package busReservation;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Customer extends JFrame implements ActionListener
{
    JButton bookt,cancelt;
    Container c;
    String name,ticketno;
    int age;
    char sex;
    Date doj;
    
	public Customer()
    {
    	super("Welcome Customer");
    	c = getContentPane();
    	setLayout(new FlowLayout());
    	
    	bookt = new JButton("BOOK    TICKET");
    	bookt.setSize(20,5);
    	cancelt = new JButton("CANCEL TICKET");
    	cancelt.setSize(10,5);
    	
    	bookt.addActionListener(this);
    	cancelt.addActionListener(this);
    	
    	c.add(bookt);
    	c.add(cancelt);
    	
    	setSize(200,200);
        setLocation(200,200);
        setVisible(true);
        setResizable(false);
     }

	public void actionPerformed(ActionEvent ae) 
	{
	    if(ae.getSource() == bookt)
	    {
	    	new BookT();
	    }
	    else if(ae.getSource() == cancelt)
	    {
	    	new CancelT();
	    }
	}
	
	void setTicketNo(Date d,int busno,int seatno)
	{
		
	}
}
