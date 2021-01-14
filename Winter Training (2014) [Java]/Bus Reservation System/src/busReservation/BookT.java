package busReservation;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class BookT extends JFrame implements ActionListener
{
	ArrayList<Bus> arraylist = new ArrayList<Bus>();
	JLabel s,d,jd;
	JTextField st,dt,jdt;
	JButton chkavl;
	Container c;
	public BookT()
    {
		super("Choose Your Trip");
		JOptionPane.showMessageDialog(null,"Book Your Ticket");
		c = getContentPane();
		setLayout(new GridLayout(4,2));
		
		s = new JLabel("           Source : ");
		d = new JLabel("        Destination : ");
		jd= new JLabel("      Date of Journey : ");
		
		st = new JTextField(10);
		dt = new JTextField(10);
		jdt = new JTextField(10);
		
		chkavl = new JButton("Check Availabity");
		
		chkavl.addActionListener(this);
		
		c.add(s);c.add(st);
		c.add(d);c.add(dt);
		c.add(jd);c.add(jdt);
		c.add(chkavl);
		
		setSize(300,300);
	    setLocation(200,200);
	    setVisible(true);
	    setResizable(false);
	}

	public void actionPerformed(ActionEvent ae) 
	{
		if(ae.getSource() == chkavl)
		{
			new InputTicketDetails();
		}
	}
    
    
}
